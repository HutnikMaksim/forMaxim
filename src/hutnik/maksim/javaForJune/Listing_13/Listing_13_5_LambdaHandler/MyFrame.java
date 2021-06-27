package hutnik.maksim.javaForJune.Listing_13.Listing_13_5_LambdaHandler;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    MyFrame(String name){
        super(name);
        setBounds(250,250,350,400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        ImageIcon img = new ImageIcon("d:/Загрузки/Лекции по JAVA/Sonya.jpg");
        String text = "<html>Это Сонька.<br>Она прикольная.<br>Она не София.</html>";
        JLabel lbl = new JLabel(text, img, JLabel.LEFT);
        Font F = new Font(Font.MONOSPACED,Font.BOLD,16);
        lbl.setFont(F);
        lbl.setBounds(10,30,320,280);
        lbl.setOpaque(true);
        lbl.setBackground(Color.PINK);
        lbl.setBorder(BorderFactory.createEtchedBorder());
        add(lbl);
        JButton btn = new JButton("Закрыть окно");
        btn.setBounds(50,320,200,30);
        btn.setFocusPainted(false);
        btn.addActionListener(e -> {System.exit(0);});
        add(btn);
        setVisible(true);
    }
}
