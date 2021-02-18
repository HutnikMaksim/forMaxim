package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_26_Interfaces;

public class Animals implements Info{
    public int id;

    public Animals(int id){
        this.id = id;
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }


    @Override
    public void showInfo() {
        System.out.println("Id is " + id);
    }
}
