package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

import java.util.Scanner;

public class Less_07_Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number:");
        int i = scanner.nextInt();
        System.out.println("Your number is " + i);
        System.out.print("Enter string:");
        String str = scanner.next();
        System.out.println("Your string is " + str);

    }
}
