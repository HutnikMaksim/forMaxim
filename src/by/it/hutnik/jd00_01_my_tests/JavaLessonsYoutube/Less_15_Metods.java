package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

class Less_15_Metods {
    public static void main(String[] args) {
        Person persons1 = new Person();
        persons1.name = "Max";
        persons1.surname = "Hutnik";
        persons1.age = 46;
        persons1.hight = 188.4;
        persons1.weight = 106.2;
        persons1.sex = "I'm man";
        persons1.speak();
        persons1.asked();
        Person persons2 = new Person();
        persons2.name = "Valerii";
        persons2.surname = "Shyshko";
        persons2.age = 47;
        persons2.hight = 186.7;
        persons2.weight = 107.9;
        persons2.sex = "I'm man";
        persons2.speak();
        persons2.asked();
        Person person3 = new Person();
        person3.surname = "Steblova";
        person3.name = "Anna";
        person3.age = 24;
        person3.hight = 165.7;
        person3.weight = 52.2;
        person3.sex = "I'm woman";
        person3.speak();
        person3.asked();
    }
}
class Person{
    String name;
    String surname;
    int age;
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