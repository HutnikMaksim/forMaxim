package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long sek = scanner.nextLong();
        long s, m, h, d, w;
        String sekunds, minuts, hours, strS, strM, strH, strD, strW;
        w = sek / 60 / 60 / 24 / 7;
        d = (sek / 60 / 60 / 24 ) % 7;
        h = (sek / 60 / 60) % 24;
        m = (sek / 60) % 60;
        s = sek % 60;
        if(s<10){
            sekunds = "0" + s;
        } else sekunds = String.valueOf(s);

        if(m<10){
            minuts = "0" + m;
        }else minuts = String.valueOf(m);

        if(h<10){
            hours = "0" + h;
        }else hours = String.valueOf(h);

        if (s == 1 || (s % 10 == 1 && s != 11)) { // если s равно 1 или другому числу оканчивающемуся на 1, за исключением 11
            strS = "секунда";
        } else
            if ((s  > 1 && s  < 5) || ((s % 10 > 1 && s % 10 < 5) && (s <= 11 || s >= 19))) {
            strS = "секунды";
        } else strS = "секунд";

        if (m == 1 || (m % 10 == 1 && m != 11)) {
            strM = "минута";
        } else
            if ((m  > 1 && m  < 5) || ((m % 10 > 1 && m % 10 < 5) && (m <= 11 || m >= 19))) {
            strM = "минуты";
        } else strM = "минут";

        if (h == 1 || (h % 10 == 1 && h != 11)) {
            strH = "час";
        } else
            if ((h  > 1 && h  < 5) || ((h % 10 > 1 && h % 10 < 5) && (h <= 11 || h >= 19))) {
            strH = "часа";
        } else strH = "часов";

        if (d == 1) {
            strD = "день";
        } else
            if (d > 1 && d <5) {
            strD = "дня";
        } else strD = "дней";

        if (w == 1 || (w % 10 == 1 && w != 11)) {
            strW = "неделя";
        } else
            if ((w  > 1 && w  < 5) || ((w % 10 > 1 && w % 10 < 5) && (w <= 11 || w >= 19))) {
            strW = "недели";
        } else strW = "недель";

//        System.out.println("weeks = " + w);
//        System.out.println("days = " + d);
//        System.out.println("hours = " + hours);
//        System.out.println("minuts = " + minuts);
//        System.out.println("sekonds = " + sekunds);
//        System.out.println("time " + hours + ":" + minuts + ":" + sekunds);

        System.out.print(sek + " секунд - это: " + w + " " + strW);
        System.out.print( " " + d  + " " + strD);
        System.out.print(" " + hours + " " + strH);
        System.out.print(" " + minuts + " " + strM);
        System.out.println(" " + sekunds + " " +  strS);

    }
}
