package by.it.hutnik.javazadachi_com;
/*
Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что первый и второй члены
последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
 */
public class Task_4_11 {
    public static void main(String[] args) {
        int a = 1;
        int f = 1;
        int c = 0;
        System.out.println("1-е число Фабиначчи = " + a);
        for (int i = 0; i < 10; i++) {
            a = f + c; // 1 + 0 = 1
            System.out.println((i + 2) + "-е число Фабиначчи = " + a);
            c = f;
            f = a;
        }
    }
}
