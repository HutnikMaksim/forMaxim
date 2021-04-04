package hutnik.maksim.javaForJune;

import javax.swing.*;

public class Operator_if {
    public static void main(String[] args) {
        int number;
        String input, text, title, file;
        file = "d:/Загрузки/Лекции по JAVA/";
        ImageIcon img;
        input = JOptionPane.showInputDialog(null, "Введи число", "Проверка числа", 3);
        if(input == null){
            JOptionPane.showMessageDialog(null, "Не введено число", "Ошибка", 0);
            System.exit(0);
        }
        number = Integer.parseInt(input);
        if(number % 2 == 0){
            img = new ImageIcon(file + "Sonya.png");
            text = "Число " + number + " чётное!";
            title = "Чётное";
        } else {
            img = new ImageIcon(file + "Sonya2.png");
            text = "Число " + number + " нечётное!";
            title = "Нечётное";
        }
        JOptionPane.showMessageDialog(null, text, title, -1, img);
    }
}
