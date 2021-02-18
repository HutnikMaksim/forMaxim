package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_29_Polimorphism;

public class Dog extends Animal{
    public void bark(){
        System.out.println("I'm barking!");
    }
    @Override
    public void eat(){
        System.out.println("Dog eating...");
    }
}
