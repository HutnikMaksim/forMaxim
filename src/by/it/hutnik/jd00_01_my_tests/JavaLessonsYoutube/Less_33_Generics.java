package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

import by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.MinMaxValueInArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Less_33_Generics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ind = scanner.nextInt();
        List<String> animals = new ArrayList<>();//создаём типизированный (String) динамический массив
        animals.add("Dog"); // index 0
        animals.add("Cat"); // index 1
        animals.add("Fox"); // index 2
        animals.add("Mouse"); // index 3
        animals.add("Elephant"); // index 4
        animals.add("Wolf"); // index 5
        animals.add("Horse"); // index 6
        animals.add("Duck"); // index 7
        animals.add("Shark"); // index 8
        animals.add("Worm"); // index 9
        animals.add("Cow"); // index 10

        List<Integer> index = new ArrayList<>();
        index.add(3);
        index.add(3);
        index.add(3);
        index.add(5);
        index.add(8);
        index.add(4);
        index.add(5);
        index.add(4);
        index.add(5);
        index.add(4);
        index.add(3);


        String animal = animals.get(ind); // вызываем значение массива, указав его индекс
        Integer id = index.get(ind);
        System.out.println(animal + " " + id);

    }
}
