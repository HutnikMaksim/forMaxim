package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_32_UpcastingDawncasting;

class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // Upcasting - восходящее преобразование
        Animal animal = dog;
        // Downcasting - нисходящее преобразование
        Dog dog1 = (Dog) animal;
    }
}
