package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

import java.text.DecimalFormat;
import java.text.ParseException;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            return NumberUtils.toInt(str) % 2 == 0;
        }
        catch (Exception e){
            return false;
        }
    }
}
