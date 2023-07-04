package ru.gb.lessons.interfaces.core.personal;

public class Nurse {
        public void feedAnimal(Runnable animal) {
        System.out.println("Nurse is feeding the animal");
        System.out.println("Animal running speed: " + animal.getRunningSpeed());
    }
}
