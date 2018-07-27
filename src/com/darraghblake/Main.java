package com.darraghblake;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(101012));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        int tempNum;
        if (number < 10) {
            return -1;
        }
        do {
            tempNum = number % 10;
            sum += tempNum;
            number /= 10;
        } while (number > 0);
        return sum;
    }

}
