package hutnik.maksim.javaForJune.Listing_4;

import java.util.Scanner;

class Listing_4_5_UsingForDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n;
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println("Сумма квадратов чисел от 1 до " + n + " равна " + sum);
    }
}
