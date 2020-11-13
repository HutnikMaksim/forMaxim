package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;
/* Задать целое число в виде переменной, это число - сумма денег в рублях.
Вывести число на экран, добавив к нему слово "рублей" в правильном падеже
 */
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum = scanner.nextInt(); // Вводим с клавиатуры сумму в рублях
        String str;
        int divSum = sum % 100;
        if ((sum == 1) || ((sum % 10 == 1) && (divSum - 11 != 0))){
            str = "рубль";
        } else
            if ((sum > 1 && sum <5)
                || ((sum % 10 == 2) && (divSum - 12 != 0))
                || ((sum % 10 == 3) && (divSum - 13 != 0))
                || ((sum % 10 == 4) && (divSum - 14 != 0))){
                str = "рубля";
        } else str = "рублей";
        System.out.println(sum + " " + str);
    }
}
