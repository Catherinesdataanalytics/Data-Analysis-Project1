package com.company;
public class DogLaughter{
    public static void main(String[] args){

        Dog d1 = new Dog(25);
        //d.weightInPounds = 25;
        d1.makeNoise();

        Dog d2 = new Dog(52);
        d2.makeNoise();

        Dog biggerdog = Dog.maxDog(d1,d2);
        biggerdog.makeNoise();

        ///different method,no static one
        Dog bigger = d1.maxdog(d2);
        bigger.makeNoise();

    }
}
