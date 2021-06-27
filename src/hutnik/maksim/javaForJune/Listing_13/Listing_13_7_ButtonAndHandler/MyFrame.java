package hutnik.maksim.javaForJune.Listing_13.Listing_13_7_ButtonAndHandler;

import javax.swing.*;

class MyFrame extends JFrame {
    MyFrame(String name, String txt, ImageIcon img){
        super(name);
        setBounds(250,250,370,400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        MyPanel pnl = new MyPanel(txt, img);
        MyButton btn = new MyButton(75,300,200,30);
        add(pnl);
        add(btn);
        setVisible(true);
    }
}
