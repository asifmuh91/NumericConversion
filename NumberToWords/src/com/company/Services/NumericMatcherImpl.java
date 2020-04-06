package com.company.Services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumericMatcherImpl implements NumericMatcher {

    private static final String INVALID = "number invalid";
    NumbersToWord n = new NumbersToWordImpl(); //imported the NumbersToWordService

    @Override
    public String matchAndConvertMatcher(String input) {
        int countMatches = 0; //keeping a counter to check if more than 1 valid numbers are present in string
        Pattern p2 = Pattern.compile("\\d+"); //checking all numbers in input
        Matcher m1 = p2.matcher(input);
        while (m1.find()) {
            countMatches++;//increment for each match found
        }
        if (countMatches <= 1) {
            Pattern p = Pattern.compile("^\\d+|^\\d+[ ]|[ ]\\d+[ ]|[ ]\\d+$"); //this pattern match all valid scenarios that can happen in a string
            Matcher m2 = p.matcher(input);
            if (m2.find()) {
                String output = n.convertNumberToWord(Long.parseLong(m2.group().trim()));
                if (!output.isEmpty()) {
                    return output;
                } else {
                    return INVALID; // if convertToNumber does not give any output
                }
            } else {
                return INVALID; // if m2 matcher doesn't find any match in input
            }
        } else {
            return INVALID; //if more than 1 matches appear
        }

    }
}
