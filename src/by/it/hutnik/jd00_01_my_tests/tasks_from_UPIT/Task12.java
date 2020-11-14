package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;
/* Вычислить факториал целых чисел от 0 до 10 с помощью цикла while
*/
public class Task12 {
    public static void main(String[] args) {
        int i = 0;
        int factorial = 1;
        while (i <= 10){
            factorial = factorial * i;
            if (i <= 1){ // так как известно, что факториал и 0 и 1 = 1 и он всегда положительное число!
                factorial = 1;
            }
            System.out.println(i + " " + factorial);
            i++;
        }
    }
}
