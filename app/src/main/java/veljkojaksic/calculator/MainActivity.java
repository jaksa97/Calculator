package veljkojaksic.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity {

    private TextView previousCalculation;
    private EditText display;

    public static final String KEY_Previous_Calculation = "Previous_Calculation";


    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            getSupportActionBar().hide();
        }

        setContentView(R.layout.activity_main);

        previousCalculation = findViewById(R.id.previousCalculationView);
        display = findViewById(R.id.displayEditText);

        display.setEnabled(false);

        if (savedInstanceState != null)
        {
            final String previousCalculationString = savedInstanceState.getString(KEY_Previous_Calculation);
            if (previousCalculationString != null)
            {
                previousCalculation.setText(previousCalculationString);
            }
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState)
    {
        if (previousCalculation!=null)
        {
            outState.putString(KEY_Previous_Calculation, previousCalculation.getText().toString());
        }
        super.onSaveInstanceState(outState);
    }

    private void updateDisplay(String strToAdd){
        display.setText(String.format("%s%s", display.getText().toString(), strToAdd));
        display.setSelection(display.getSelectionStart() + display.getText().length());
    }

    public void btnClearClick(View view) {
        if (display.getText().toString().length() != 0 || previousCalculation.getText().toString().length() != 0) {
            display.setText("");
            previousCalculation.setText("");
        }
        else
        {
            Toast.makeText(this,"You don't have any equation to delete", Toast.LENGTH_LONG).show();
        }
    }

    public void btnParenthesesOpenClick(View view) {
        updateDisplay(getResources().getString(R.string.btnParenthesesOpenText));
    }

    public void btnParenthesesCloseClick(View view) {
        updateDisplay(getResources().getString(R.string.btnParenthesesCloseText));
    }

    public void btnDivideClick(View view) {
        updateDisplay(getResources().getString(R.string.btnDivideText));
    }

    public void btnSevenClick(View view) {
        updateDisplay(getResources().getString(R.string.btnSevenText));
    }

    public void btnEightClick(View view) {
        updateDisplay(getResources().getString(R.string.btnEightText));
    }

    public void btnNineClick(View view) {
        updateDisplay(getResources().getString(R.string.btnNineText));
    }

    public void btnMultiplyClick(View view) {
        updateDisplay(getResources().getString(R.string.btnMultiplyText));
    }

    public void btnFourClick(View view) {
        updateDisplay(getResources().getString(R.string.btnFourText));
    }

    public void btnFiveClick(View view) {
        updateDisplay(getResources().getString(R.string.btnFiveText));
    }

    public void btnSixClick(View view) {
        updateDisplay(getResources().getString(R.string.btnSixText));
    }

    public void btnSubtractClick(View view) {
        updateDisplay(getResources().getString(R.string.btnSubtractText));
    }

    public void btnOneClick(View view) {
        updateDisplay(getResources().getString(R.string.btnOneText));
    }

    public void btnTwoClick(View view) {
        updateDisplay(getResources().getString(R.string.btnTwoText));
    }

    public void btnThreeClick(View view) {
        updateDisplay(getResources().getString(R.string.btnThreeText));
    }

    public void btnAddClick(View view) {
        updateDisplay(getResources().getString(R.string.btnAddText));
    }

    public void btnZeroClick(View view) {
        updateDisplay(getResources().getString(R.string.btnZeroText));
    }

    public void btnDecimalClick(View view) {
        updateDisplay(getResources().getString(R.string.btnDecimalText));
    }

    public void btnEqualClick(View view) {
        String userExpression = display.getText().toString();

        if (userExpression.length() != 0) {
            previousCalculation.setText(userExpression);

            userExpression = userExpression.replaceAll(getResources().getString(R.string.btnDivideText), "/");
            userExpression = userExpression.replaceAll(getResources().getString(R.string.btnMultiplyText), "*");

            Expression expression = new Expression(userExpression);
            String result = String.valueOf(expression.calculate());

            display.setText(result);
            display.setSelection(result.length());
        }
        else
        {
            Toast.makeText(this,"You don't have any equation to calculate", Toast.LENGTH_LONG).show();
        }
    }

    public void btnBackspaceClick(View view) {
        String oldDisplay = display.getText().toString();

        if (oldDisplay.length()!=0) {
            String newDisplay = oldDisplay.substring(0, oldDisplay.length()-1);
            display.setText(newDisplay);
            display.setSelection(newDisplay.length());
        }
        else
        {
            Toast.makeText(this,"You don't have any character to delete", Toast.LENGTH_LONG).show();
        }
    }

    public void btnSinClick(View view) {
        updateDisplay("sin(");
    }

    public void btnCosClick(View view) {
        updateDisplay("cos(");
    }

    public void btnTanClick(View view) {
        updateDisplay("tan(");
    }

    public void btnArcSinClick(View view) {
        updateDisplay("arcsin(");
    }

    public void btnArcCosClick(View view) {
        updateDisplay("arccos(");
    }

    public void btnArcTanClick(View view) {
        updateDisplay("arctan(");
    }

    public void btnLogClick(View view) {
        updateDisplay("log(");
    }

    public void btnLnClick(View view) {
        updateDisplay("ln(");
    }

    public void btnSqrtClick(View view) {
        updateDisplay("sqrt(");
    }

    public void btnEClick(View view) {
        updateDisplay("e");
    }

    public void brnPiClick(View view) {
        updateDisplay("pi");
    }

    public void btnAbsoluteValueClick(View view) {
        updateDisplay("abs(");
    }

    public void btnFactorialClick(View view) {
        updateDisplay("!");
    }

    public void btnSquareClick(View view) {
        updateDisplay("^(2)");
    }

    public void btnPowerClick(View view) {
        updateDisplay("^(");
    }

    public void btnUnitConverterClick(View view) {

        final Intent intent =new Intent(this, UnitConverterActivity.class);

        startActivity(intent);
    }
}