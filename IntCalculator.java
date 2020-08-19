package com.company;

import java.util.Scanner;

public class IntCalculator extends Main {
    static Scanner scan = new Scanner(System.in);
    int num1 = getInt();
    int num2 = getInt();
    char symbol = getSymbol();
    int result = calculate(num1, num2, symbol);

    // enter 2 int values
    public int getInt(){
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
    public int calculate(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                System.out.println("Your result is: " + result + ".");
                break;
            case '-':
                result = num1-num2;
                System.out.println("Your result is: " + result + ".");
                break;
            case '*':
                result = num1*num2;
                System.out.println("Your result is: " + result + ".");
                break;
            case '/':
                result = num1/num2;
                System.out.println("Your result is: " + result + ".");
                break;
            default:
                System.out.println("Oops, something wrong. Try again.");
                scan.close();
        }
        return result;
    }

    public static void printResult(int result) {

    }
}