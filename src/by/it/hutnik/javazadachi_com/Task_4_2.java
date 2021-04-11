package by.it.hutnik.javazadachi_com;
/*
Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
 */
class Task_4_2 {
    public static void main(String[] args) {
        int a  = 1;
        for (int i = 1; i <= 55; i++) {
            System.out.println(i + "-й индекс = " + a + " ");
            a = a + 2;
        }
    }
}
