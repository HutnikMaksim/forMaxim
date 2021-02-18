package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

public class Less_20_Constructor {
    public static void main(String[] args) {
        People people1 = new People("Max", 46);
        people1.print();
        People people2 = new People("Valera", 47);
        people2.print();
        People people3 = new People("Tania", 23);
        people3.print();
        People people4 = new People("Sonia", 3);
        people4.print();

    }
}
class People{
    String name;
    int age;

    public People(String name, int age){
        this.name = name;
        this.age = age;
    }

    void print(){
        System.out.println("My name is " + name + ", I have " + age + " years");
    }
}