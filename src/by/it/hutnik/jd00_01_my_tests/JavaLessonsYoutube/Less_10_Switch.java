package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

import java.util.Scanner;

public class Less_10_Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your age:");
        byte age = scanner.nextByte();
        switch (age){
            case 0:
                System.out.println("You born now!");
                break;
            case 6:
                System.out.println("You go to school!");
                break;
            case 17:
                System.out.println("Your first kiss!");
                break;
            case 18:
                System.out.println("You go to army");
                break;
            case 20:
                System.out.println("You come back home!");
                break;
            default:
                System.out.println("You working!");
        }
        System.out.print("Enter char station:");
        String string = scanner.next();
        switch (string){
            case "a":
                System.out.println("1 station");
                break;
            case "b":
                System.out.println("2 station");
                break;
            case "c":
                System.out.println("3 station");
                break;
            default:
                System.out.println("No station");
        }
    }
}
