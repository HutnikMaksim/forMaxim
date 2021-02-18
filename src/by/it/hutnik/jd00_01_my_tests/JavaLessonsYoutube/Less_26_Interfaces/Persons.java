package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_26_Interfaces;

public class Persons implements Info{
    public String name;

    public Persons(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("My name is " + name);
    }
}
