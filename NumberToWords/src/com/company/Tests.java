package com.company;

import com.company.Services.NumericMatcher;
import com.company.Services.NumericMatcherImpl;

public class Tests {

    private static String S1 = "The pump is 536 deep underground";
    private static String S1_EXPECTED_AFTER_CONVERTED = "five hundred and thirty-six";
    private static String S2 = "We processed 9121 records.";
    private static String S2_EXPECTED_AFTER_CONVERTED = "nine thousand, one hundred and twenty-one";
    private static String S3 = "Variables reported as having a missing type #65678";
    private static String S3_EXPECTED_AFTER_CONVERTED = "number invalid";
    private static String S4 = "Interactive and printable 10022 ZIP code.";
    private static String S4_EXPECTED_AFTER_CONVERTED = "ten thousand and twenty-two";
    private static String S5 = "The database has 66723107008 records.";
    private static String S5_EXPECTED_AFTER_CONVERTED = "sixty-six billion, seven hundred and twenty-three million, one hundred and seven thousand and eight";
    private static String S6 = "I received 23 456,9 KGs";
    private static String S6_EXPECTED_AFTER_CONVERTED = "number invalid";
    NumericMatcher numericMatcher = new NumericMatcherImpl();

    public static void main(String[] args) {
        Tests tests = new Tests();
        if (tests.numericMatcher.matchAndConvertMatcher(S1).equals(S1_EXPECTED_AFTER_CONVERTED)) {
            System.out.println("Test Passed S1");
        } else {
            System.out.println("Test Failed S1");
        }
        if (tests.numericMatcher.matchAndConvertMatcher(S2).equals(S2_EXPECTED_AFTER_CONVERTED)) {
            System.out.println("Test Passed S2");
        } else {
            System.out.println("Test Failed S2");
        }
        if (tests.numericMatcher.matchAndConvertMatcher(S3).equals(S3_EXPECTED_AFTER_CONVERTED)) {
            System.out.println("Test Passed S3");
        } else {
            System.out.println("Test Failed S3");
        }
        if (tests.numericMatcher.matchAndConvertMatcher(S4).equals(S4_EXPECTED_AFTER_CONVERTED)) {
            System.out.println("Test Passed S4");
        } else {
            System.out.println("Test Failed S4");
        }
        if (tests.numericMatcher.matchAndConvertMatcher(S5).equals(S5_EXPECTED_AFTER_CONVERTED)) {
            System.out.println("Test Passed S5");
        } else {
            System.out.println("Test Failed S5");
        }
        if (tests.numericMatcher.matchAndConvertMatcher(S6).equals(S6_EXPECTED_AFTER_CONVERTED)) {
            System.out.println("Test Passed S6");
        } else {
            System.out.println("Test Failed S6");
        }

    }

}

