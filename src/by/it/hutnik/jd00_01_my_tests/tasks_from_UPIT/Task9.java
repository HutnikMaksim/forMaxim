package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
        Calendar calendar = new GregorianCalendar(year, mounth -1, day);
        Date date = calendar.getTime();
        System.out.println(date);
//        switch (day) {
//            case 1:
//                System.out.println("Day = 1");
//                break;
//            case 2:
//                System.out.println("Day = 2");
//                break;
//            case 3:
//                System.out.println("Day = 3");
//                break;
//            case 4:
//                System.out.println("Day = 4");
//                break;
//            case 5:
//                System.out.println("Day = 5");
//                break;
//            case 6:
//                System.out.println("Day = 6");
//                break;
//            case 7:
//                System.out.println("Day = 7");
//                break;
//            case 8:
//                System.out.println("Day = 8");
//                break;
//            case 9:
//                System.out.println("Day = 9");
//                break;
//            case 10:
//                System.out.println("Day = 10");
//                break;
//            case 11:
//                System.out.println("Day = 11");
//                break;
//            case 12:
//                System.out.println("Day = 12");
//                break;
//            case 13:
//                System.out.println("Day = 13");
//                break;
//            case 14:
//                System.out.println("Day = 14");
//                break;
//            case 15:
//                System.out.println("Day = 15");
//                break;
//            case 16:
//                System.out.println("Day = 16");
//                break;
//            case 17:
//                System.out.println("Day = 17");
//                break;
//            case 18:
//                System.out.println("Day = 18");
//                break;
//            case 19:
//                System.out.println("Day = 19");
//                break;
//            case 20:
//                System.out.println("Day = 20");
//                break;
//            case 21:
//                System.out.println("Day = 21");
//                break;
//            case 22:
//                System.out.println("Day = 22");
//                break;
//            case 23:
//                System.out.println("Day = 23");
//                break;
//            case 24:
//                System.out.println("Day = 24");
//                break;
//            case 25:
//                System.out.println("Day = 25");
//                break;
//            case 26:
//                System.out.println("Day = 26");
//                break;
//            case 27:
//                System.out.println("Day = 27");
//                break;
//            case 28:
//                System.out.println("Day = 28");
//                break;
//            case 29:
//                System.out.println("Day = 29");
//                break;
//            case 30:
//                System.out.println("Day = 30");
//                break;
//            case 31:
//                System.out.println("Day = 31");
//                break;
//            default:
//                System.out.println("Incorrect Day");
//
//        }
//        switch (mounth){
//            case 1:
//                System.out.println("Mounth = January");
//                break;
//            case 2:
//                System.out.println("Mounth = February");
//                break;
//            case 3:
//                System.out.println("Mounth = March");
//                break;
//            case 4:
//                System.out.println("Mounth = April");
//                break;
//            case 5:
//                System.out.println("Mounth = May");
//                break;
//            case 6:
//                System.out.println("Mounth = June");
//                break;
//            case 7:
//                System.out.println("Mounth = July");
//                break;
//            case 8:
//                System.out.println("Mounth = August");
//                break;
//            case 9:
//                System.out.println("Mounth = September");
//                break;
//            case 10:
//                System.out.println("Mounth = Oktober");
//                break;
//            case 11:
//                System.out.println("Mounth = November");
//                break;
//            case 12:
//                System.out.println("Mounth = December");
//                break;
//            default:
//                System.out.println("Incorrect mounth");
//        }
//
//        System.out.println("Year = " + year);
//
//        if (mounth > 12) {
//            System.out.println("Нет такого месяца в году");
//        }
//        if ((mounth == 1) && (day > 31)) {
//            System.out.println("Нет такого числа в Январе!");
//        }
//        if ((mounth == 2) && (day > 29) && (leapYear == true)){
//            System.out.println("Нет такого числа в Феврале");
//        } else
//            if ((mounth == 2) && (day > 28) && (leapYear == false)) {
//                System.out.println("Нет такого числа в Феврале");
//            }
//        if ((mounth == 3) && (day > 31)) {
//            System.out.println("Нет такого числа в Январе!");
//        } else System.out.println(day + " " + mounth + " " + year);
    }
}
