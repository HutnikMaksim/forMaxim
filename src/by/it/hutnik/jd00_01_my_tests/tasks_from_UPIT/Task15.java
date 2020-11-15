package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;
/* Найти среди чисел от 50 до 70 второе простое число (число называется простым,
если оно делится без остатка только на 1 и на само себя) и завершить цикл с использованием break.
 */
public class Task15 {
    public static void main(String[] args) {
        int div = 0;
        int n = 50;
        int m = 70;
        int temp = 0;
        int count = 0;
        int result = 0;
        for (int interval = n; interval <= m; interval++) {
            for (int scalar = 1; scalar <= interval; scalar++) {
                div = interval % scalar;
                if (div == 0){
                    temp = temp + 1;
                }
            }
            if (temp == 2){
                count = count + 1;
            }
            temp = 0;
            if (count == 2){
                result = interval;
                    break;
            }
        }
        System.out.println(result);
    }
}
