package com.epam.demo;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.List;


public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.000");
        boolean result = true;
        for (String str : args) {
            try {
                result = result && decimalFormat.parse(str).doubleValue() > 0;
            } catch (Exception e) {
                return false;
            }
        }
        return result;

    }


}
