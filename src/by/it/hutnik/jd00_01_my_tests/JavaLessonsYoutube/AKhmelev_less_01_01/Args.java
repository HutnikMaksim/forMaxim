package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.AKhmelev_less_01_01;

public class Args {
    private String[] args;

    Args (String[] args){
        this.args = args;
    }
    void printArgs(){
        int i = 1;
        for (String arg : args) {
            System.out.println("Argument " + i + " = " + arg);
            i++;
        }
    }
}
