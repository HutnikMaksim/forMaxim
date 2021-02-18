package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

public class Less_16_Return {
    public static void main(String[] args) {
        Persona persons1 = new Persona();
        persons1.name = "Max";
        persons1.surname = "Hutnik";
        persons1.age = 46;
        persons1.hight = 188.4;
        persons1.weight = 106.2;
        persons1.sex = "I'm man";
        persons1.speak();
        persons1.asked();
        System.out.println("Last to ameretura = " + persons1.ameretura() + " years");
        Persona persons2 = new Persona();
        persons2.name = "Valerii";
        persons2.surname = "Shyshko";
        persons2.age = 47;
        persons2.hight = 186.7;
        persons2.weight = 107.9;
        persons2.sex = "I'm man";
        persons2.speak();
        persons2.asked();
        System.out.println("Last to ameretura = " + persons2.ameretura() + " years");
        Persona person3 = new Persona();
        person3.surname = "Steblova";
        person3.name = "Anna";
        person3.age = 24;
        person3.hight = 165.7;
        person3.weight = 52.2;
        person3.sex = "I'm woman";
        person3.speak();
        person3.asked();
        System.out.println("Last to ameretura = " + person3.ameretura() + " years");
    }
}
class Persona{
    String name;
    String surname;
    int age;
    int ameretura(){
        int pens = 63 - age;
        return pens;
    }
    double hight;
    double weight;
    String sex;
    void speak(){
        System.out.println(surname + " " + name + " " + age + " years " + hight + " cm " + weight + " kg");
    }
    void asked(){
        System.out.println(sex);
    }
}