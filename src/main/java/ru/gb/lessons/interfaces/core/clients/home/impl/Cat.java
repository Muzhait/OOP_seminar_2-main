package ru.gb.lessons.interfaces.core.clients.home.impl;

import ru.gb.lessons.interfaces.core.clients.home.Pet;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Cat extends Pet {
    public Cat() {
    }

    public Cat(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
    
}

class Cat implements Soundable, Runnable {
    @Override
    public int getSoundSpeed() {
        return 5;
    }
    
    @Override
    public int getRunningSpeed() {
        return 15;
    }
}

class Bird implements Soundable, Flyable {
    @Override
    public int getSoundSpeed() {
        return 2;
    }
}