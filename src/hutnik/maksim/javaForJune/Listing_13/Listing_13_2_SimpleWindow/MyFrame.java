package hutnik.maksim.javaForJune.Listing_13.Listing_13_2_SimpleWindow;

import javax.swing.*;

class MyFrame extends JFrame {
    MyFrame(String name){
        super(name);
        setBounds(300,300,800,600);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
