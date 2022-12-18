package com.bridgelabz.generics;

public class MaximumMain {
    public static void main(String[] args) {
        findingMaxInteger();
        findingMaxFloat();

    }
    private static void findingMaxInteger() {
        System.out.println("\n Finding max integer.........");
        Integer num1=10,num2=20,num3=100;
        if((num3.compareTo(num2)>0)&&(num3.compareTo(num1)>0)){
            System.out.println(num3 + "is greater than" + num2 + "and" + num1);
        }
        else if((num2.compareTo(num1)>0)&&(num2.compareTo(num3)>0)){
            System.out.println(num2 + " is greater than" + num1 + "and" + num3);
        }
        else if((num1.compareTo(num2)>0)&&(num1.compareTo(num3)>0)){
            System.out.println(num1 +"is greater than" + num2 + "and" + num3);
        }
    }
    private static void findingMaxFloat() {
        System.out.println("\n Finding max float.........");

        Float num1=10.6f;
        Float num2=6.6f;
        Float num3=1.6f;
        if((num3.compareTo(num2)>0)&&(num3.compareTo(num1)>0)){
            System.out.println(num3 + "is greater than" + num2 + "and" + num1);
        }
        else if((num2.compareTo(num1)>0)&&(num2.compareTo(num3)>0)){
            System.out.println(num2 + " is greater than" + num1 + "and" + num3);
        }
        else if((num1.compareTo(num2)>0)&&(num1.compareTo(num3)>0)){
            System.out.println(num1 +"is greater than" + num2 + "and" + num3);
        }
    }


}
