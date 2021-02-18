package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_01;

import java.util.Scanner;

public class TaskC3 {
    public static void main(String[] args) {
        System.out.print("Input weight the man: ");
        Scanner scanner = new Scanner(System.in);
        int weightEarth = scanner.nextInt();
        double weightMars = getWeight(weightEarth);
        System.out.println("The weight of man on the Mars is: " + weightMars);
    }
    public static double getWeight(int weight){
        double res = (double) weight * (3.86 / 9.81);
        return Math.round(res * 100.0) / 100.0;
    }
}
