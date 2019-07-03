package com.company;
/*
  This is my first Calculator on Java.
  This program is work! Check it out!
  Press run to see result.
*/

   public class Calculator {
        int result;

        public Calculator() {}

        public int add(int firstParam, int secondParam) {
            result = firstParam + secondParam;
            return result;
        }

        public int subtract(int firstParam, int secondParam) {
            result = firstParam - secondParam;
            return result;
        }

        public int multiply(int firstParam, int secondParam) {
            result = firstParam * secondParam;
            System.out.println("You multiplied " + firstParam + " on " + secondParam + ". Your result:");
            return result;
        }

        public int divide(int firstParam, int secondParam) {
            result = firstParam / secondParam;
            System.out.println("How much it will be if " + firstParam + " divide on " + secondParam + "? Answer:");
            return result;
        }

        public void modulo(int firstParam, int secondParam) {
            result = firstParam % secondParam;
            System.out.println("You divide " + firstParam + " on " + secondParam + ". Your modulo is: " + result);
        }

       public static void main(String[] args) {
           Calculator myCalculator = new Calculator();

           // First variant to PRINT add-method
           System.out.println(myCalculator.add(5,7));

           // Second variant to PRINT another subtract-method
           int subtraction = myCalculator.subtract(45, 11);
           System.out.println(subtraction);

           // PRINT multiply
           System.out.println(myCalculator.multiply(5,5));

           // PRINT divide
           System.out.println(myCalculator.divide(750,25));

           // PRINT modulo
           myCalculator.modulo(10,3);
       }
    }