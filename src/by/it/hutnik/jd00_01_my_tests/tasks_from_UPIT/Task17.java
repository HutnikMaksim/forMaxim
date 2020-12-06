package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;

import java.text.DecimalFormat;
import java.util.Scanner;

/* Задать произвольное целое число и вывести его в бухгалтерском формате,
т.е. начиная справа, каждые три позиции отделяются пробелом.
Например: число 20023143 должно быть выведено как 20 023 143.
 */
public class Task17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double i = scanner.nextDouble();
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        System.out.println(decimalFormat.format(i));
    }
}
