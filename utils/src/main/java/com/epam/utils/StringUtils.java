package com.epam.utils;

import java.text.DecimalFormat;
import java.text.ParseException;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        DecimalFormat decimalFormat = new DecimalFormat("#.000");
        try {
            return decimalFormat.parse(str).doubleValue() % 2 == 0;
        } catch (Exception e) {
            return false;
        }
    }
}
