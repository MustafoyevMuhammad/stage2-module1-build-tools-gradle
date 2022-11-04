package com.epam.demo;

import com.epam.utils.StringUtils;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.List;


public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        return args.stream().map(StringUtils::isPositiveNumber).isParallel();
    }


}
