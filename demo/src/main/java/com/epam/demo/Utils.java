package com.epam.demo;

import java.util.List;


public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        boolean result = true;
        for (String str : args) {
            result = result && Integer.parseInt(str) > 0;
        }
        return result;
    }
}