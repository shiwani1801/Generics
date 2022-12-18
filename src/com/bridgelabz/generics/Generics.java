package com.bridgelabz.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Generics <T extends Comparable<T>> {
    T firstValue;
    T secondValue;
    T thirdValue;
    T fourthValue;

    public void Generics(T firstValue, T secondValue, T thirdValue, T fourthValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
        this.fourthValue=fourthValue;

    }


    public <T extends Comparable> Object compare(T firstValue, T secondValue, T thirdValue,T fourthValue) {
        ArrayList <T>arrayList=new ArrayList<T>();
        arrayList.add(firstValue);
        arrayList.add(secondValue);
        arrayList.add(thirdValue);
        arrayList.add(fourthValue);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println("sorted list : "+arrayList);
        maxMethod(firstValue,secondValue,thirdValue,fourthValue);
        return null;
    }

    public <T extends Comparable> Object maxMethod(T firstValue,T secondValue, T thirdValue,T fourthValue) {
        T maxValue;
       if ((fourthValue.compareTo(thirdValue) > 0) && (fourthValue.compareTo(secondValue) > 0) && (fourthValue.compareTo(firstValue) > 0)) {
           System.out.println(fourthValue + " greater than " + thirdValue + " ,"+ secondValue + " and " + firstValue);
           maxValue = fourthValue;
           printMax(maxValue, firstValue, secondValue, thirdValue, fourthValue);
       }else if((thirdValue.compareTo(fourthValue) > 0) && (thirdValue.compareTo(secondValue) > 0) && (thirdValue.compareTo(firstValue) > 0)) {
           System.out.println(thirdValue + " greater than "+ fourthValue + " ," + secondValue + " and " + firstValue);
           maxValue=thirdValue;
           printMax(maxValue,firstValue,secondValue,thirdValue,fourthValue);
        }else if((secondValue.compareTo(fourthValue) > 0) &&(secondValue.compareTo(firstValue) > 0) && (secondValue.compareTo(thirdValue) > 0)){
            System.out.println(secondValue + " greater than "+ fourthValue + " ," + firstValue + " and " + thirdValue);
            maxValue=secondValue;
            printMax(maxValue,firstValue,secondValue,thirdValue,fourthValue);
        }else if ((firstValue.compareTo(fourthValue) > 0) &&(firstValue.compareTo(secondValue) > 0) && (firstValue.compareTo(thirdValue) > 0)){
            System.out.println(firstValue + " greater than "+ fourthValue + " , " + secondValue + " and " + thirdValue);
            maxValue=firstValue;
            printMax(maxValue,firstValue,secondValue,thirdValue,fourthValue);
        }
        return null;
    }

    public  <T extends Comparable> void printMax(T maxValue, T firstValue, T secondValue, T thirdValue,T fourthValue) {
        System.out.println("\nPrintMax method.............");
        System.out.println("first value = "+firstValue);
        System.out.println("2nd value = "+secondValue);
        System.out.println("3rd value = "+thirdValue);
        System.out.println("4th value = "+fourthValue);

        System.out.println("\nMaximum value = "+maxValue);
    }
}
