package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;
/* Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
 */
public class Task14 {
    public static void main(String[] args) {
        long n = 7893823445L;
        int t = 10;
        long sum = 0;
        long temp = 0;
        do {
            temp = n % t;
            n = n - temp;
            sum += temp;
            n = n / 10;
        } while (n > 0);
        System.out.println(sum);
    }
}
