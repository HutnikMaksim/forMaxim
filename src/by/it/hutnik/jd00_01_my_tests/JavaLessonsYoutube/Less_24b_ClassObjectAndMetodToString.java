package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

class Less_24b_ClassObjectAndMetodToString {
    public static void main(String[] args) {
        Humans humans = new Humans("Bob", 37);
        System.out.println(humans);
    }
}
class Humans{
    private String name;
    private int age;

    public Humans(String name, int age){
        this.name = name;
        this.age =age;
    }

    public String toString(){ // переопределение метода toString, чтобы он печатал не hashCode, а строку
        return name + ", " + age;
    }
}
