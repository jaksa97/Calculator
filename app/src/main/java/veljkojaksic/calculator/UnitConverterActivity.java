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
        final Intent intent = new Intent(this, CurrencyConverterActivity.class);

        startActivity(intent);
    }

    public void btnLengthConverterClick(View view) {
        final Intent intent = new Intent(this,ConverterActivity.class);

        intent.putExtra(C.name.KEY_Converter_Title, getString(R.string.lengthConverter));
        intent.putExtra(C.name.KEY_Convert_Map, C.map.lengthMap);
        intent.putExtra(C.name.KEY_Dropdown, C.dropdown.lengthDropdown);

        startActivity(intent);
    }

    public void btnAreaConverterClick(View view) {
        final Intent intent = new Intent(this,ConverterActivity.class);

        intent.putExtra(C.name.KEY_Converter_Title, getString(R.string.areaConverter));
        intent.putExtra(C.name.KEY_Convert_Map, C.map.areaMap);
        intent.putExtra(C.name.KEY_Dropdown, C.dropdown.areaDropdown);

        startActivity(intent);
    }

    public void btnVolumeConverterClick(View view) {
        final Intent intent = new Intent(this,ConverterActivity.class);

        intent.putExtra(C.name.KEY_Converter_Title, getString(R.string.volumeConverter));
        intent.putExtra(C.name.KEY_Convert_Map, C.map.volumeMap);
        intent.putExtra(C.name.KEY_Dropdown, C.dropdown.volumeDropdown);

        startActivity(intent);
    }

    public void btnTemperatureConverterClick(View view) {
        final Intent intent = new Intent(this,ConverterActivity.class);

        intent.putExtra(C.name.KEY_Converter_Title, getString(R.string.temperatureConverter));
        intent.putExtra(C.name.KEY_Dropdown, C.dropdown.temperatureDropdown);

        startActivity(intent);
    }

    public void btnWeightConverterClick(View view) {
        final Intent intent = new Intent(this,ConverterActivity.class);

        intent.putExtra(C.name.KEY_Converter_Title, getString(R.string.weightConverter));
        intent.putExtra(C.name.KEY_Convert_Map, C.map.weightMap);
        intent.putExtra(C.name.KEY_Dropdown, C.dropdown.weightDropdown);

        startActivity(intent);
    }
}