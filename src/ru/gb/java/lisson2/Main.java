package ru.gb.java.lisson2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(200,2);
        Dog dog = new Dog(500,10,0.5f);
        System.out.println("Кот:");
        cat.run(200);
        cat.run(250);
        cat.swim(100);
        cat.jump(1);
        cat.jump(3);
        System.out.println("Собака:");
        dog.run(450);
        dog.run(550);
        dog.swim(9);
        dog.swim(100);
        dog.jump(0.9f);
        dog.jump(0.1f);
        Animal newCat = createCat();
        Animal newDog = createDog();
        System.out.println("new Cat:");
        System.out.println("Не умеет плавать, максимальнный бег: " + newCat.maxRunLength + " и максимальный прыжок: " + newCat.maxJumpHeight);
        newCat.run(200);
        newCat.run(250);
        newCat.swim(100);
        newCat.jump(1);
        newCat.jump(3);
        System.out.println("new Dog:");
        System.out.println("максимальное плавонье: " + newDog.maxSwimLength +", максимальный бег: " + newDog.maxRunLength + " и максимальный прыжок: " + newDog.maxJumpHeight);
        newDog.run(450);
        newDog.run(550);
        newDog.swim(9);
        newDog.swim(100);
        newDog.jump(0.9f);
        newDog.jump(0.1f);

    }
    static Animal createCat(){
        Random random = new Random();
        float maxJump = random.nextInt(10) + random.nextFloat();
        float maxRun = random.nextInt(200) + random.nextFloat();
        Cat cat = new Cat(maxRun, maxJump);
        return cat;
    }
    static Animal createDog(){
        Random random = new Random();
        float maxJamp = random.nextInt(10) + random.nextFloat();
        float maxRun = random.nextInt(200) + random.nextFloat();
        float maxSwim = random.nextInt(50) + random.nextFloat();
        Dog dog = new Dog(maxRun, maxSwim, maxJamp);
        return dog;
    }
}

