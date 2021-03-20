package veljkojaksic.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import veljkojaksic.calculator.Refrofit.RetrofitBuilder;
import veljkojaksic.calculator.Refrofit.RetrofitInterface;

public class CurrencyConverterActivity extends AppCompatActivity {

    Spinner convertTo;
    Spinner convertFrom;
    EditText amountToConvert;
    TextView convertResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_currency_converter);

        convertFrom = (Spinner) findViewById(R.id.convertFrom);
        convertTo = (Spinner) findViewById(R.id.convertTo);
        amountToConvert = findViewById(R.id.amountToConvert);
        convertResult = findViewById(R.id.convertResult);

        String[] fromDropdown = {"EUR", "USD", "GBP", "CAD", "CHF"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, fromDropdown);
        convertFrom.setAdapter(adapter);
        convertTo.setAdapter(adapter);
        convertTo.setSelection(1);
    }

    public void btnConvertCurrencyClick(View view) {
        RetrofitInterface retrofitInterface = RetrofitBuilder.getRetrofitInstance().create(RetrofitInterface.class);
        Call<JsonObject> exchange = retrofitInterface.getExchangeCurrency(convertFrom.getSelectedItem().toString());

        exchange.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                JsonObject responseResult = response.body();
                JsonObject rates = responseResult.getAsJsonObject("rates");
                double amount = Double.valueOf(amountToConvert.getText().toString());
                double exchangeRate = Double.valueOf(rates.get(convertTo.getSelectedItem().toString()).toString());
                double result = amount*exchangeRate;
                convertResult.setText(String.valueOf(result));
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                showToast();
            }
        });
    }

    private void showToast()
    {
        Toast.makeText(this,"API call failed", Toast.LENGTH_LONG).show();
    }
}