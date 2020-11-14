package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;
/* Вычислить произведение чмсел от 1 до 25 с помощью цикла do while
 */
public class Task13 {
    public static void main(String[] args) {
        int i = 1;
        int n = 25;
        int mul = 1;
        do {
            mul *= i;
            i++;
        }
        while (i <= n);
        System.out.println(mul);
    }
}
