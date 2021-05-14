package hutnik.maksim.javaForJune.Listing_5;

import javax.swing.*;
import java.util.Random;

class Listing_5_3_UsingForArrayDemo {
    public static void main(String[] args) {
        int size = 10;
        Random random = new Random();
        String txt = "Вывод массива \n| ";
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10) + 1;
            txt += arr[i] + " | ";
        }
        txt += "\nПроверка \n| ";
        for (int s : arr){
            txt += s + " | ";
        }
        JOptionPane.showMessageDialog(null, txt, "Title", 1);
    }
}
