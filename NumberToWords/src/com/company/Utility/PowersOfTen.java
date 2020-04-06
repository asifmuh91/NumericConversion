package com.company.Utility;

public enum PowersOfTen {

    BILLION(1000000000, "billion"), MILLION(1000000, "million"), THOUSAND(1000, "thousand"), HUNDRED(100, "hundred");

    public long value;
    public String name;

    PowersOfTen(long value, String name) {
        this.value = value;
        this.name = name;

    }

    long valueOfNumber() {
        return value;
    }

    String nameOfValue() {
        return name;
    }

}
