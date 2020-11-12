package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;

import javax.swing.*;
import java.util.Scanner;

public class Task4 {
    public static int Vars(){
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return (a + b) + a * b;
    }

    public static void main(String[] args) {
        int sum = Vars();
        JOptionPane.showMessageDialog(null, sum,"Fuck",JOptionPane.ERROR_MESSAGE);


    }
}
