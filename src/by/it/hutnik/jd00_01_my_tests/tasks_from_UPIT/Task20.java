package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;
/* Создать переменную для массива из 10 элементов. Заполнить его произвольными значениями целочисленного типа.
Найти максимальный элемент и вывести его индекс на экран.
 */
public class Task20 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 +1);

            if (max < array[i]){
                max = array[i];

            }
            System.out.println("Значение массива = " + array[i]);
        }

        System.out.println("Максимальное значение = " + max);

        for (int m = 0; m < array.length; m++) {
            if (array[m] == max){
                System.out.println("Индекс максимального значения = " + m);
            }
        }



    }
}
