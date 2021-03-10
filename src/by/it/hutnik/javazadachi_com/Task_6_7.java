package by.it.hutnik.javazadachi_com;
/*
Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем,
что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
 */
public class Task_6_7 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 0;
        System.out.println("1) " + a + " ");
        for (int i = 0; i < 19; i++) {
            a = b + c;
            c = b;
            b = a;
            System.out.println((i + 2) + ") " + a  + " ");
        }
    }
}
