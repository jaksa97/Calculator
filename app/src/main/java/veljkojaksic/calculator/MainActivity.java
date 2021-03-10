package veljkojaksic.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView previousCalculation;
    private EditText display;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        previousCalculation = findViewById(R.id.previousCalculationView);
        display = findViewById(R.id.displayEditText);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            display.setShowSoftInputOnFocus(false);
        }
    }

    public void btnClearClick(View view) {
    }

    public void btnParenthesesOpenClick(View view) {
    }

    public void btnParenthesesCloseClick(View view) {
    }

    public void btnDivideClick(View view) {
    }

    public void btnSevenClick(View view) {
    }

    public void btnEightClick(View view) {
    }

    public void btnNineClick(View view) {
    }

    public void btnMultiplyClick(View view) {
    }

    public void btnFourClick(View view) {
    }

    public void btnFiveClick(View view) {
    }

    public void btnSixClick(View view) {
    }

    public void btnSubtractClick(View view) {
    }

    public void btnOneClick(View view) {
    }

    public void btnTwoClick(View view) {
    }

    public void btnThreeClick(View view) {
    }

    public void btnAddClick(View view) {
    }

    public void btnZeroClick(View view) {
    }

    public void btnDecimalClick(View view) {
    }

    public void btnEqualClick(View view) {
    }

    public void btnBackspaceClick(View view) {
    }
}