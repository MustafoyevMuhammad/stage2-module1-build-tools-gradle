package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return Integer.parseInt(str) % 2 == 0;
         //here magic will happen
    }
}
