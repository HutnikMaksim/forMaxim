package hutnik.maksim.javaForJune.Listing_1;

import javax.swing.*;

class Listing_1_6_ShowMeWindowDemo {
    public static void main(String[] args) {
        String txt, msg;
        txt = JOptionPane.showInputDialog(null,"Имя для окна", "Название`", JOptionPane.CANCEL_OPTION);
        msg = JOptionPane.showInputDialog(null,"Текст сообщения:", "Содержание", -1);
        JOptionPane.showMessageDialog(null, msg, txt, 1);
    }
}
