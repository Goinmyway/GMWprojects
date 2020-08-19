package com.company;
/*
Written by: Yevgenii Miroshnychenko
Date: 02/07/2019
Email: eugenem487@gmail.com
Description: Use the command line to see how program is work.
*/
public class Main {

    // Main-method must:
    // 1 read our values (with getInt)
    // 2 read the incoming symbol (with getSymbol)
    // 3 pass data to calculate method
    // 4 print the result
    public static void main(String[] args) {
        IntCalculator first = new IntCalculator();
        System.out.println(first.getInt());

    }
}