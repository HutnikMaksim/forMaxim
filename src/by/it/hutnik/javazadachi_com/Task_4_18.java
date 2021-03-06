package by.it.hutnik.javazadachi_com;

import java.util.Scanner;

/*
В американской армии считается несчастливым число 13, а в японской — 4.
Перед международными учениями штаб российской армии решил исключить номера боевой техники,
содержащие числа 4 или 13 (например, 40123, 13313, 12345 или 13040), чтобы не смущать иностранных коллег.
Если в распоряжении армии имеется 100 тыс. единиц боевой техники и каждая боевая машина имеет номер
от 00001 до 99999, то сколько всего номеров придётся исключить?
 */
public class Task_4_18 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 4; i < 100000; i++) {
            String str = String.valueOf(i);
            if(str.contains("4") || str.contains("13")) {

                count ++;
                System.out.printf("%5s)%6s ", count, str);
                if(count % 10 == 0){
                    System.out.println();
                }
            }

        }
        System.out.println();
        System.out.println("Всего придётся исключить " + count + " номеров");
    }
}
