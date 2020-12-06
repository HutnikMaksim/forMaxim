package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;
/* Создать переменную для массива из 10 элементов.
Заполните его произвольными значениями целочисленного типа и выведите последний элемент массива на экран.
 */
public class Task18 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 10 + 1);
            System.out.println("Элемент массива с индексом " + i + " " + " = " + mass[i]);

        }
        System.out.println();
        System.out.println("Последний элемент массива = " + mass[mass.length-1]);
    }
}
