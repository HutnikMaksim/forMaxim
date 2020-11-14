package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;


import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/* Задать три числа - день, месяц и год. Вывести на экран в виде трёх чисел дату следующего дня.
*/
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int day = scanner.nextInt();
        int mounth = scanner.nextInt();
        int year = scanner.nextInt();
        boolean leapYear = false;
        if (year % 4 == 0) {
            leapYear = true;
        }

        LocalDate localDate = LocalDate.of(year, Month.of(mounth), day);
        System.out.println(localDate);
        day = day +1;
        if ((day > 31) && (mounth == 12)){
            day = 1;
            mounth = 1;
            year = year + 1;
        }
        if ((day > 31) && (mounth == 0
                        || mounth == 3
                        || mounth == 5
                        || mounth == 7
                        || mounth == 8
                        || mounth == 10)){
            day = 1;
            mounth = mounth + 1;
        } else
            if (((day > 28) && (mounth == 2)) || ((day >29) && (mounth == 2) && (leapYear == true))) {
                day = 1;
                mounth = 3;
        } else
            if ((day >30) && (mounth == 4
                           || mounth == 6
                           || mounth == 9
                           || mounth == 11)){
                day = 1;
                mounth = mounth + 1;
            }
        LocalDate nextLocalDate = LocalDate.of(year, Month.of(mounth), day);
        System.out.println(nextLocalDate);

    }
}
