package veljkojaksic.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.HashMap;

public class ConverterActivity extends AppCompatActivity {

    TextView converterTitle;
    Spinner convertTo;
    Spinner convertFrom;
    EditText amountToConvert;
    TextView convertResult;

    HashMap<String, Double> map = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_converter);

        converterTitle = findViewById(R.id.converterTitle);
        convertFrom = (Spinner) findViewById(R.id.convertFrom);
        convertTo = (Spinner) findViewById(R.id.convertTo);
        amountToConvert = findViewById(R.id.amountToConvert);
        convertResult = findViewById(R.id.convertResult);

        final Intent intent = getIntent();

        converterTitle.setText(intent.getStringExtra(C.name.KEY_Converter_Title));

        String[] dropdown = intent.getStringArrayExtra(C.name.KEY_Dropdown);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, dropdown);
        convertFrom.setAdapter(adapter);
        convertTo.setAdapter(adapter);
        convertTo.setSelection(1);

        if (converterTitle.getText().toString() != getString(R.string.temperatureConverter))
        {
            map = (HashMap<String, Double>) intent.getSerializableExtra(C.name.KEY_Convert_Map);
        }
    }

    public void btnConvertClick(View view) {

        String tempTitle = converterTitle.getText().toString();
        String tempRes = getString(R.string.temperatureConverter);

        if(tempTitle != tempRes)
        {
            //Log.i("title",tempTitle + " -> " + tempRes);
            Double from = map.get(convertFrom.getSelectedItem().toString());
            Double to = map.get(convertTo.getSelectedItem().toString());

            Double exchange = to/from;

            Double result = Double.valueOf(amountToConvert.getText().toString())*exchange;

            convertResult.setText(result.toString());

        }
        else
        {
            String from = convertFrom.getSelectedItem().toString();
            String to = convertTo.getSelectedItem().toString();
            double amount = Double.valueOf(amountToConvert.getText().toString());
            exchangeTemperature(from, to, amount);
        }
    }

    private void exchangeTemperature(String from, String to, double amount) {
        if(from == to)
        {
            convertResult.setText(String.valueOf(amount));
        }
        else
        {
            switch (from)
            {
                case "C":
                    switch (to)
                    {
                        case "K":
                            convertResult.setText(String.valueOf(amount-273.15));
                            break;
                        case "F":
                            convertResult.setText(String.valueOf(amount*1.8+32));
                            break;
                    }
                    break;
                case "K":
                    switch (to)
                    {
                        case "C":
                            convertResult.setText(String.valueOf(amount+273.15));
                            break;
                        case "F":
                            convertResult.setText(String.valueOf(amount*1.8+523.67));
                            break;
                    }
                    break;
                case "F":
                    switch (to)
                    {
                        case "C":
                            convertResult.setText(String.valueOf((amount-32)/1.8));
                            break;
                        case "K":
                            convertResult.setText(String.valueOf((amount-523.67)/1.8));
                            break;
                    }
                    break;
            }
        }
    }
}