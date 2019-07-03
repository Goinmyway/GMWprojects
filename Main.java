package com.company;
import java.util.Scanner;
/*
Written by: Evgeniy Miroshnychenko
Date: 02/07/2019
Email: goingmyway@ukr.net
Description: Use the command line to see how program is work.
*/
public class Main {
    static Scanner scan = new Scanner(System.in);

    // Main-method must:
    // 1 read our values (with getInt)
    // 2 read the incoming symbol (with getSymbol)
    // 3 pass data to calculate method
    // 4 print the result
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char symbol = getSymbol();
        int result = calculate(num1, num2, symbol);
        System.out.println("Your result is: " + result + ".");;
    }

    // enter 2 int values
    public static int getInt(){
        System.out.println("Enter the value: ");
        int num;
        if(scan.hasNextInt()){
            num = scan.nextInt();
        } else {
            System.out.println("Your entered value is incorrect. Try again.");
            scan.next();
            num = getInt();
        }
        return num;
    }

    // detect the right symbol that we needed
    public static char getSymbol(){
        System.out.println("Enter the operation that need to perform: ");
        char symbol;
        if(scan.hasNext()){
            symbol = scan.next().charAt(0); // scanner.next method read all string,
        } else {                            // after charAt(0) read only null element of string
            System.out.println("Your entered symbol is incorrect. Try again.");
            scan.next();
            symbol = getSymbol();
        }
        return symbol;
    }

    // performs arithmetic operations over num1,num2, accept symbol from getSymbol()
    public static int calculate(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Operation not found. Try again.");
                result = calculate(num1, num2, getSymbol());
        }
        return result;
    }
}