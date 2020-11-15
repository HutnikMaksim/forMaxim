package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;
/* Для целых чисел, которые делятся на 7 в диапазоне от 1 до 100, вывести на экран строку "Hope!"
 */
public class Task16 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0){
                System.out.println(i + " Hope!");
            } else System.out.println(i);
        }
    }
}
