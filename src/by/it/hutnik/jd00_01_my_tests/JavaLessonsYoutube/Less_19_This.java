package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

class Less_19_This {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Tom");
        human1.getName();
        human1.setAge(25);
        human1.getAge();
        human1.print();
        Human human2 = new Human();
        human2.setName("Bob");
        human2.getName();
        human2.setAge(31);
        human2.getAge();
        human2.print();
    }
}
class Human{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    void print(){
        System.out.println("Person " + name + ", " + age + " years");
    }
}