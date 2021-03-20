package veljkojaksic.calculator;

import java.util.HashMap;

public final class C {

    public static final class name {

        public static final String KEY_Previous_Calculation = "Previous_Calculation";
        public static final String KEY_Converter_Title = "Converter_Title";
        public static final String KEY_Convert_Map = "Convert_Map";
        public static final String KEY_Dropdown = "Dropdown";
    }

    public static final class map {

        public static final HashMap<String, Double> lengthMap = new HashMap<String, Double>() {{ put("km", 1d); put("m", 1000d); put("dm", 10000d); put("cm", 100000d); put("mm", 1000000d); }};
        public static final HashMap<String, Double> weightMap = new HashMap<String, Double>() {{ put("T", 1d); put("kg", 1000d); put("g", 1000000d); put("mg", 1000000000d); }};
        public static final HashMap<String, Double> areaMap = new HashMap<String, Double>() {{ put("km^2", 1d); put("m^2", 1000000d); put("dm^2", 100000000d); put("cm^2", 10000000000d); put("mm^2", 1000000000000d); }};
        public static final HashMap<String, Double> volumeMap = new HashMap<String, Double>() {{ put("km^3", 1d); put("m^3", 1000000000d); put("dm^3", 1000000000000d); put("cm^3", 1000000000000000d); put("mm^3", 1000000000000000000d); }};
    }

    public static final class dropdown {
        public static final String[] lengthDropdown = new String[] {"km", "m", "dm", "cm", "mm"};
        public static final String[] weightDropdown = new String[] {"T", "kg", "g", "mg"};
        public static final String[] areaDropdown = new String[] {"km^2", "m^2", "dm^2", "cm^2", "mm^2"};
        public static final String[] volumeDropdown = new String[] {"km^3", "m^3", "dm^3", "cm^3", "mm^3"};
        public static final String[] temperatureDropdown = new String[] {"C", "K", "F"};
    }
}
