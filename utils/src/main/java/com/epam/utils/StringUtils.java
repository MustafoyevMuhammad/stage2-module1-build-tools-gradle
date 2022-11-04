package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

import java.text.DecimalFormat;
import java.text.ParseException;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return NumberUtils.toDouble(str) % 2 == 0.0;
    }
}
