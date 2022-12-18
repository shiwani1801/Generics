package com.bridgelabz.generics;

import java.util.ArrayList;

import java.util.Collections;

public class Generics <T extends Comparable<T>> {


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

   
