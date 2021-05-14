package hutnik.maksim.javaForJune.Listing_1;

import javax.swing.*;

class Listing_1_5_InputDialogDemo {
    public static void main(String[] args) {
        String txt;
        txt = JOptionPane.showInputDialog("Введите текст");
        JOptionPane.showMessageDialog(null,"Вы ввели такой текст: \n" + txt, "Message", 1);
    }
}
