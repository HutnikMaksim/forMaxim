package hutnik.maksim.javaForJune;

import javax.swing.*;

public class Using2DCharArrayDemo {
    public static void main(String[] args) {
        int[] size = {5, 11, 3 ,7}; // объявление и инициализация одномерного int массива size
        char[][] symbols = new char[size.length][]; // объявление и инициализация двухмерного char массива symbols
                                                    // с количеством строк 4 (от количества элементов массива size)
                                                    //
        char s = 'A';
        String txt = "";
        for (int i = 0; i < symbols.length; i++) { // от 0 до 3 (длина size)
            symbols[i] = new char[size[i]]; //
            for (int j = 0; j < symbols[i].length; j++) {
                symbols[i][j] = s;
                s++;
                txt += " | " + symbols[i][j] + " ";
            }
            txt += "|\n";
        }
        JOptionPane.showMessageDialog(null,txt, "Массив со строками разной длины:", -1, new ImageIcon("d:/Загрузки/Лекции по JAVA/Sonya.jpg"));

    }
}
