package hutnik.maksim.javaForJune.Listing_13.Listing_13_4_AnonymousHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame {
    MyFrame(String name){
        super(name);
        setBounds(250, 250, 300, 200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        JLabel lbl = new JLabel("Текст синего цвета", JLabel.CENTER);
        lbl.setBounds(10,30,266,50);
        lbl.setForeground(Color.BLUE);
        lbl.setBorder(BorderFactory.createEtchedBorder());
        add(lbl);
        JButton btn = new JButton("Закрыть окно");
        btn.setBounds(50,120,200,30);
        btn.setFocusPainted(false);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(btn);
        setVisible(true);
    }
}
