package com.company;

public class KalkNum {
    byte test;
    int num;
    double ans ;
    char op;
    String ravenstvo;

    public KalkNum() {
        this.test = test;
        this.num = num;
        this.ans = ans;
        this.op = op;
        this.ravenstvo = ravenstvo;
    }

    public void setColor(String color) {
        this.op = op;
    }

    public String getVinNumber() {
        return ravenstvo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KalkNum kalkTest = (KalkNum) o;

        return false;
    }
}

