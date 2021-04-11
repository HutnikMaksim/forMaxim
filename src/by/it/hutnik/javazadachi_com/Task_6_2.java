package by.it.hutnik.javazadachi_com;
/*
Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же массив
выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
 */
class Task_6_2 {
    public static void main(String[] args) {
        int[] mass = new int[50];
        int j = 0;
        for (int i = 1; i <= 99; i = i + 2) {
            mass[j] = i;
            System.out.print(mass[j] + " ");
            j++;
        }
        System.out.println();
        j = 0;
        for (int i = 99; i >= 1; i = i - 2) {
            mass[j] = i;
            System.out.print(mass[j] + " ");
            j++;
        }
    }
}
