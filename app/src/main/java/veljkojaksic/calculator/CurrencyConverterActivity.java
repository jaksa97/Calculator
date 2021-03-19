package veljkojaksic.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CurrencyConverterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_currency_converter);
    }
}