package org.pursuit;

public class Overloader {
    public double doubleDivision(int num01, int num02) {
        num01 = (int) 4.0;
        num02 = (int) 2.0;
        double result = (num01 / num02);
        return result;

    }

    public double doubleDivisio(int num03, double num04) {
        num03 = (int) 4.0;
        num04 = 2.0;
        double result = num03 / num04;
        return result;

    }

    public double doubleDivision(double num05, int num06) {
        num05 = 6.0;
        num06 = (int) 3.0;
        double result = num05 / num06;
        return result;
    }

    public double doubleDivision(double num07, double num08) {
        num07 = 10.0;
        num08 = 5.5;
        double result = num07 / num08;
        return result;
    }
}
