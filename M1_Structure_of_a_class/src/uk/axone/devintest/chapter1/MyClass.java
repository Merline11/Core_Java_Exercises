package uk.axone.devintest.chapter1;
//package com.microsoft.companyname.modulename;

/**
 * This java doc comment
 * Author:
 * Course:
 */
public class MyClass {

/*
  This is block comment
 */
String car="Mexico";

int multiplyNumbers(int a, int b){
    int product = a*b;
    return product;
}

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        int prod = myClass.multiplyNumbers(10,20);
        System.out.println(prod);
    }
}
