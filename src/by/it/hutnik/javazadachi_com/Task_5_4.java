package by.it.hutnik.javazadachi_com;

import java.util.Scanner;

/*
4. Создать программу, которая будет проверять, является ли слово из пяти букв,
введённое пользователем, палиндромом (примеры: «комок», «ротор»).
 */
class Task_5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
//        System.out.println(str);
//        System.out.println(sb);
        String rts = sb.toString();
        if(str.equals(rts)){
            System.out.println("Yes");
        } else System.out.println("No");
    }
}
