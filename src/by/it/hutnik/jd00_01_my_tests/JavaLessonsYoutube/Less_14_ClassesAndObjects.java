package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

public class Less_14_ClassesAndObjects {
    public static void main(String[] args) {
        Persons persons1 = new Persons();
        persons1.name = "Max";
        persons1.surname = "Hutnik";
        persons1.age = 46;
        persons1.hight = 188.4;
        persons1.weight = 106.2;
        System.out.println(persons1.surname + " " + persons1.name + " " + persons1.age + " years " +
                           persons1.hight + " cm " + persons1.weight + " kg");
        Persons persons2 = new Persons();
        persons2.name = "Valerii";
        persons2.surname = "Shyshko";
        persons2.age = 47;
        persons2.hight = 186.7;
        persons2.weight = 107.9;
        System.out.println(persons2.surname + " " + persons2.name + " " + persons2.age + " years " +
                persons2.hight + " cm " + persons2.weight + " kg");
    }
}
class Persons{
    String name;
    String surname;
    int age;
    double hight;
    double weight;
}
