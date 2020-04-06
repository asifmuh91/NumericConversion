package com.company.Services;

import com.company.Utility.PowersOfTen;

public class NumbersToWordImpl implements NumbersToWord {

    @Override
    public String convertNumberToWord(long number) {
        String[] oneToNineUnits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tensArray = {"zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        StringBuilder words = new StringBuilder();

        if (number == 0) {
            return "zero";
        }
        for (PowersOfTen b : PowersOfTen.values()) {
            if ((number / b.value) > 0) {
                words.append(convertNumberToWord(number / b.value)).append(" ").append(b.name);
                number = number % b.value;
                if (b.value >= 1000 && number >= 100) { //"," happens for only unit of thousands
                    words.append(",").append(" ");
                }
            }
        }
        if (number > 0) {
            // check if number is within teens
            if (number < 20) {
                // get the appropriate value from oneToNine array
                words.append(" ").append(oneToNineUnits[(int) number]);
            } else {
                if (words.length() != 0) { //making sure this adding and logic doesn't trigger if element is first element of word
                    words.append(" ").append("and").append(" ");
                }
                // get the appropriate value from tens array
                words.append(tensArray[(int) number / 10]);
                if ((number % 10) > 0) { //adding '-' on values values 1 to 99 between value of oneToNonUnites and TensArray
                    words.append("-").append(oneToNineUnits[(int) number % 10]);
                }
            }
        }
        return words.toString().trim();
    }

}
