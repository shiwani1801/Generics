package com.bridgelabz.generics;

public class MaximumMain<T> {
    public static void main(String args[]) {

        findingMaxInteger();
        findingMaxFloat();
        findingMaxString();

    }
    static Generics<Integer> object = new Generics<>();

    public static void findingMaxInteger() {
        System.out.println("\ninteger Sorted in ascending order.....................");
        //object number1 = 10, number2 = 30, number3 = 200,number4=300;
        object.compare(10,30,300,100);
    }

    public static void findingMaxFloat() {
        System.out.println("\nFloat Sorted in ascending order.....................");

        object.compare(1.1, 2.2, 4.4,5.6);
    }
    public static void findingMaxString() {
        System.out.println("\nSorted in ascending order.....................");
        String firstValue = "banana", secondValue = "watermelon", thirdValue = "apple",fourthValue="plum";
        object.compare(firstValue, secondValue, thirdValue,fourthValue);
    }

}
