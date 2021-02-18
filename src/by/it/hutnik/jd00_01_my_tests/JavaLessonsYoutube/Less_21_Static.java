package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

public class Less_21_Static {
    public static void main(String[] args) {
        Students students1 = new Students("Maxim", 46, 'B');
        Students students2 = new Students("Tania", 23, 'A');
        students1.printSt();
        students2.printSt();
        Students students3 = new Students("Andrey", 16, 'C');
        students1.printSt();
        students2.printSt();
        students3.printSt();
    }
}
class Students{
    private String name;
    private int age;
    private char klass;

    private static int countStudents;

    public Students(String name, int age, char klass){
        this.name = name;
        this.age = age;
        this.klass = klass;
        countStudents++;
    }



    public static void printCountStudents(){
        System.out.println(countStudents);
    }
    public void printSt(){
        System.out.println("I'm student " + name + ", " + age + " years," + " goin to klass " + klass +
                           " total students: " + countStudents);
    }
}
