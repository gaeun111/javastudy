package com.test.exam02;

class Fruit{

    int color;
    int taste;
    void pop(){ System.out.println("과일");}
}

class Apple extends Fruit{

    int price;
    int perfume;
    
    void cut(){ System.out.println("사과");}
}


public class InheritanceExam {

    public static void main(String[] args) {
        
        Apple apple = new Apple();
        apple.pop();
    }
}
