package hutnik.maksim.javaForJune.Listing_13.Listing_13_7_ButtonAndHandler;

import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel {
    MyPanel(String txt, ImageIcon img){
        super();
        setBounds(5,5,340,280);
        setBorder(BorderFactory.createEtchedBorder());
        setLayout(null);
        setOpaque(false);
        setBackground(Color.BLUE);
        JLabel imgLbl = new JLabel(img, SwingConstants.CENTER);
        imgLbl.setBounds(10,10,160,260);
        imgLbl.setBorder(BorderFactory.createEtchedBorder());
        JLabel txtLbl = new JLabel(txt, JLabel.CENTER);
        txtLbl.setBounds(170, 10, 160, 260);
        txtLbl.setBorder(BorderFactory.createEtchedBorder());
        txtLbl.setBackground(Color.YELLOW);
        txtLbl.setForeground(Color.RED);
        txtLbl.setOpaque(true);
        add(txtLbl);
        add(imgLbl);
    }
}
