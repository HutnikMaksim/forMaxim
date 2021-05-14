package hutnik.maksim.javaForJune.Listing_1;

import java.util.Scanner;

class Listing_1_7_ConsoleInputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой сегодня день?");
        String day = scanner.nextLine();
        System.out.println("Какой месяц?");
        String month = scanner.nextLine();
        System.out.println("Сегодня " + day + ", месяц - " + month);
    }
}
