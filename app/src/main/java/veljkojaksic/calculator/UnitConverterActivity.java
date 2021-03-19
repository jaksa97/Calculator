package veljkojaksic.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UnitConverterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_unit_converter);
    }

    public void btnCurrencyConverterClick(View view) {
        final Intent intent =new Intent(this, CurrencyConverterActivity.class);

        startActivity(intent);
    }
}