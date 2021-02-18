package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_26_Interfaces;

public class Test {
    public static void main(String[] args) {
        Animals animals = new Animals(1);
        Persons persons = new Persons("Den");
        animals.sleep();
        persons.sayHello();
        animals.showInfo();
        persons.showInfo();
        Info info1 = new Animals(3);
        Info info2 = new Persons("Bob");
        info1.showInfo();
        info2.showInfo();
    }
}
