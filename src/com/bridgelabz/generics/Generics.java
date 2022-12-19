package com.bridgelabz.generics;

import java.util.ArrayList;

import java.util.Collections;

public class Generics <T extends Comparable<T>> {
    T firstValue;
     T secondValue;
     T thirdValue;

     public void Generics(T firstValue, T secondValue, T thirdValue) {
         this.firstValue = firstValue;
      this.secondValue = secondValue;
      this.thirdValue = thirdValue;

     }

    public <T extends Comparable> Object compare(T firstValue, T secondValue, T thirdValue) {
        ArrayList <T>arrayList=new ArrayList<T>();
        arrayList.add(firstValue);
        arrayList.add(secondValue);
        arrayList.add(thirdValue);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println("sorted list : "+arrayList);
        maxMethod(firstValue,secondValue,thirdValue);
        return null;
    }

    public <T extends Comparable> Object maxMethod(T firstValue,T secondValue, T thirdValue) {
        T maxValue;

         if ((thirdValue.compareTo(secondValue) > 0) && (thirdValue.compareTo(firstValue)  > 0)) {
            System.out.println(thirdValue + " greater than " + secondValue + " and " + firstValue );
            maxValue=thirdValue;
            printMax(maxValue,firstValue,secondValue,thirdValue);
        }else  if ((secondValue.compareTo(firstValue) > 0) && (secondValue.compareTo(thirdValue)  > 0)) {
            System.out.println(secondValue + " greater than " + firstValue + " and" + thirdValue);
            maxValue=secondValue;
            printMax(maxValue,firstValue,secondValue,thirdValue);
        }else  if ((firstValue.compareTo(secondValue) > 0) && (firstValue.compareTo(thirdValue)  > 0)) {
            System.out.println(firstValue + " greater than " + secondValue + " and " + thirdValue );
            maxValue=firstValue;
            printMax(maxValue,firstValue,secondValue,thirdValue);
        }
        return null;
    }

    public  <T extends Comparable> void printMax(T maxValue, T firstValue, T secondValue, T thirdValue) {
        System.out.println("\nPrintMax method.............");
        System.out.println("1st value = "+firstValue);
        System.out.println("2nd value = "+secondValue);
        System.out.println("3rd value = "+thirdValue);

        System.out.println("\nMaximum value = "+maxValue);
    }
}


