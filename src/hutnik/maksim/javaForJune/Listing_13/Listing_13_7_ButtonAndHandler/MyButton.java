package hutnik.maksim.javaForJune.Listing_13.Listing_13_7_ButtonAndHandler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyButton extends JButton implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    MyButton(int x, int y, int w, int h){
        super("Закрыть окно");
        setBounds(x, y, w, h);
        setFocusPainted(false);
        addActionListener(this);
    }
}
