package com.bridgelabz.generics;

import java.util.ArrayList;

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

        return null;
    }

}
