package by.it.hutnik.javazadachi_com;

import java.util.Scanner;

/*
Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
(заранее не известно сколько цифр будет в числе).
 */
class Task_4_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long res = 0;
        int s = 0;
        do{
            if(a / 10 > -1){
                long temp = a % 10;
                res += temp;
                System.out.print(res + " ");
                a = a / 10;
                s++;
            }
        }
        while (a > 0);
        System.out.println();
        System.out.println("Количество цифр = " + s);
        System.out.println("Сумма всех цифр числа = " + res);
    }
}
