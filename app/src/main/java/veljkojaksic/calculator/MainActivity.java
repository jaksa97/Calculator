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

    private void updateText(String strToAdd){
        display.setText(String.format("%s%s", display.getText().toString(), strToAdd));
        display.setSelection(display.getSelectionStart() + display.getText().length());
    }

    public void btnClearClick(View view) {
        display.setText("");
        previousCalculation.setText("");
    }

    public void btnParenthesesOpenClick(View view) {
        updateText(getResources().getString(R.string.btnParenthesesOpenText));
    }

    public void btnParenthesesCloseClick(View view) {
        updateText(getResources().getString(R.string.btnParenthesesCloseText));
    }

    public void btnDivideClick(View view) {
        updateText(getResources().getString(R.string.btnDivideText));
    }

    public void btnSevenClick(View view) {
        updateText(getResources().getString(R.string.btnSevenText));
    }

    public void btnEightClick(View view) {
        updateText(getResources().getString(R.string.btnEightText));
    }

    public void btnNineClick(View view) {
        updateText(getResources().getString(R.string.btnNineText));
    }

    public void btnMultiplyClick(View view) {
        updateText(getResources().getString(R.string.btnMultiplyText));
    }

    public void btnFourClick(View view) {
        updateText(getResources().getString(R.string.btnFourText));
    }

    public void btnFiveClick(View view) {
        updateText(getResources().getString(R.string.btnFiveText));
    }

    public void btnSixClick(View view) {
        updateText(getResources().getString(R.string.btnSixText));
    }

    public void btnSubtractClick(View view) {
        updateText(getResources().getString(R.string.btnSubtractText));
    }

    public void btnOneClick(View view) {
        updateText(getResources().getString(R.string.btnOneText));
    }

    public void btnTwoClick(View view) {
        updateText(getResources().getString(R.string.btnTwoText));
    }

    public void btnThreeClick(View view) {
        updateText(getResources().getString(R.string.btnThreeText));
    }

    public void btnAddClick(View view) {
        updateText(getResources().getString(R.string.btnAddText));
    }

    public void btnZeroClick(View view) {
        updateText(getResources().getString(R.string.btnZeroText));
    }

    public void btnDecimalClick(View view) {
        updateText(getResources().getString(R.string.btnDecimalText));
    }

    public void btnEqualClick(View view) {
    }

    public void btnBackspaceClick(View view) {
    }

    public void btnSinClick(View view) {
        updateText("sin(");
    }

    public void btnCosClick(View view) {
        updateText("cos(");
    }

    public void btnTanClick(View view) {
        updateText("tan(");
    }

    public void btnArcSinClick(View view) {
        updateText("arcsin(");
    }

    public void btnArcCosClick(View view) {
        updateText("arccos(");
    }

    public void btnArcTanClick(View view) {
        updateText("arctan(");
    }

    public void btnLogClick(View view) {
        updateText("log(");
    }

    public void btnLnClick(View view) {
        updateText("ln(");
    }

    public void btnSqrtClick(View view) {
        updateText("sqrt(");
    }

    public void btnEClick(View view) {
        updateText("e");
    }

    public void brnPiClick(View view) {
        updateText("pi");
    }

    public void btnAbsoluteValueClick(View view) {
        updateText("abs(");
    }

    public void btnFactorialClick(View view) {
        updateText("!");
    }

    public void btnSquareClick(View view) {
        updateText("^(2)");
    }

    public void btnPowerClick(View view) {
        updateText("^(");
    }

}