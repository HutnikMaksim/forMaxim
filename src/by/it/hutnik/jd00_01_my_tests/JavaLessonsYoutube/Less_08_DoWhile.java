package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

import java.util.Scanner;

class Less_08_DoWhile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x;
        do {
            System.out.println("Enter number 5");
            x = scanner.nextInt();
        }
        while (x != 5);
        System.out.println("You enter number 5! Congratulation!");
    }
}
