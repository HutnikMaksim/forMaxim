package hutnik.maksim.javaForJune.Listing_4;

import javax.swing.*;

class Listing_4_4_UsingDoWhileDemo {
    static String code(int number){
        String s = "";
        int n = number;
        do{
            s = (n % 2) + s;
            n /= 2;
        } while (n != 0);
        return s;
    }

    public static void main(String[] args) {
        String input;
        String title = "Вычисление бинарного кода";
        input = JOptionPane.showInputDialog(null, "Введи целое число", title, 3);
        if(input == null){
            JOptionPane.showMessageDialog(null, "Не введено число", "Ошибка", 0);
            System.exit(0);
        }
        int num = Integer.parseInt(input);
        String code = code(num);
        String text = "Введено число " + num;
        text += "\nБинарный код числа: " + code;
        JOptionPane.showMessageDialog(null, text, title, 1);
    }
}
