package ru.gb.lessons.interfaces.core;

import java.util.ArrayList;
import java.util.List;

import ru.gb.lessons.interfaces.core.clients.Animal;
import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.clients.Human;
import ru.gb.lessons.interfaces.core.clients.home.impl.Cat;

// public class VetClinic {
//     private static List<Animals> animals = new ArrayList<>(); 
//     public static void main(String[] args) {
//         Human human = new Human("Пайтон");
//         Cat cat = new Cat(0, null, 0, null, null);
//         // animals.add(human);
//         animals.add(cat);
//         for (Animals element: animals) {
//             heal(element);
//         }    
//     }
//     private static void heal(Animals patients) {
//         System.out.println(patients.getClassName() + "вылечен");
//     }  
// }


public class VeterinaryClinic {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Nurse nurse = new Nurse();
        Dog dog = new Dog();
        Cat cat = new cat();
        doctor.treatAnimal(dog);  // Доктор лечит животное со скоростью 20
        doctor.treatAnimal(cheetah);  // Доктор лечит животное со скоростью 100
        nurse.assistAnimal(bird);  // Медсестра помогает животному со скоростью 30
        nurse.assistAnimal(airplane);  // Медсестра помогает животному со скоростью 900
    }
}
