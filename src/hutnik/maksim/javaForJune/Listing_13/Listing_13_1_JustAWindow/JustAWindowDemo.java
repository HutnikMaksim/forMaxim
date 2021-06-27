package hutnik.maksim.javaForJune.Listing_13.Listing_13_1_JustAWindow;

import javax.swing.*;

class JustAWindowDemo {
    public static void main(String[] args) {
        JFrame wnd = new JFrame("Обычное окно");
        wnd.setSize(600,400);
        wnd.setLocation(550,150);
        wnd.setResizable(false);
        wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wnd.setVisible(true);
    }
}
