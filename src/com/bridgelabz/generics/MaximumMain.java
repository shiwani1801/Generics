package com.bridgelabz.generics;

public class MaximumMain<T> {
    public static void main(String args[]) {
        int choice=3;
        switch (choice){
            case 1:
                findingMaxInteger();
                break;
            case 2:
                findingMaxFloat();
                break;
            case 3:
                findingMaxString();
        }

    }
    static Generics<Integer> object = new Generics<>();

    public static void findingMaxInteger() {
        System.out.println("\ninteger Sorted in ascending order.....................");
        //object number1 = 10, number2 = 400, number3 = 200 ,number4 =300;
        object.compare(10, 400, 200,300);
    }

    public static void findingMaxFloat() {
        System.out.println("\nFloat Sorted in ascending order.....................");
        Float number1 = 4.4f;
        Float number2 = 4.8f;
        Float number3 = 3.8f;
        Float number4 = 9.6f;
        object.compare(number1, number2, number3,number4);
    }
    public static void findingMaxString() {
        System.out.println("\nSorted in ascending order.....................");
        String firstValue = "banana", secondValue = "watermelon", thirdValue = "apple",fourthValue="plum";
        object.compare(firstValue, secondValue, thirdValue,fourthValue);
    }

}