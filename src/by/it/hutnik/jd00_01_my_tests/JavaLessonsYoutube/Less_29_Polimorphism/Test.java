package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_29_Polimorphism;

class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);
    }
    public static void test(Animal animal){
        animal.eat();
    }
}
