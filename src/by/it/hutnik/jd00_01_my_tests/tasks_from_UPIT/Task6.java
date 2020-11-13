package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;
/*Создать метод с одним целочисленным параметром. Метод должен определить,
является ли последняя цифра числа семёркой и вернуть boolean значение.
 */
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int digit = scanner.nextInt();
        boolean bool = false;
        if (digit % 10 / 7 == 1){
            bool = true;
        } else bool = false;
        System.out.println(bool);

    }

}
