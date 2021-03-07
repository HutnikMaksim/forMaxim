package by.it.hutnik.javazadachi_com;
/*
Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
Перед созданием массива подумайте, какого он будет размера.
 */
public class Task_5_5 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        for (int i = 2; i <= 20; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 2; i <= 20; i = i + 2) {
            System.out.println(i);
        }

    }
}
