package ru.gb.java.lisson2;

public class Cat extends Animal{
    public Cat(float maxRunLength, float maxJumpHeight){
        super(maxRunLength, 0,maxJumpHeight);
    }
    @Override
    public void swim(float length){
        System.out.println("Кот не может плавать");
    }
}

