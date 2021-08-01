package hutnik.maksim.JavaForAll.BasicOfJava;

import javax.swing.*;

class Listing_1_3 {
    public static void main(String[] args) {
        String txt, str;
        int count;
        char start, finish;
        str = JOptionPane.showInputDialog(
                "Введите текст");
        count = str.length();
        start = str.charAt(0);
        finish = str.charAt(count - 1);
        txt = "Текст: " + str + "\n";
        txt += "Символов в тексте: " + count + "\n";
        txt += "Первый символ: " + start + "\n";
        txt += "Последний символ: " + finish;
        JOptionPane.showMessageDialog(null, txt);
    }


}
