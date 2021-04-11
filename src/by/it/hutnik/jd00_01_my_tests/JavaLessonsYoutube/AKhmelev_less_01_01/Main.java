package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.AKhmelev_less_01_01;

class Main {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.printSlogan();
        hello.setSlogan("Zdaroff");
        hello.printSlogan();
        Args argsObj = new Args(args);
        argsObj.printArgs();
    }
}
