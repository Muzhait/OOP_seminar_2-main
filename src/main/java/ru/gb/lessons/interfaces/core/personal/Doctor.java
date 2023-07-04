package ru.gb.lessons.interfaces.core.personal;

public class Doctor {
        public void treatAnimal(Soundable animal) {
        System.out.println("Doctor is treating the animal");
        System.out.println("Animal sound speed: " + animal.getSoundSpeed());
    }
}
