package by.it.zubovich.jd01_03;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        double[] array = InOut.getArray(str);
        InOut.printArray(array);
        InOut.printArray(array,"V", 4);
        System.out.println();
        Helper.sort(array);
        InOut.printArray(array,"V", 3);
        double min = Helper.findMin(array);
        System.out.println(min);
        double max = Helper.findMax(array);
        System.out.println(max);
    }

}
