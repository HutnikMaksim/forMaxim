package hutnik.maksim.javaForJune.Listing_13.Listing_13_3_WindowWithButton;

import javax.swing.*;

class MyFrame extends JFrame {
    MyFrame(){
        super("Окно с кнопкой");
        setBounds(300,300,700,600);
        setResizable(false);
        setDefaultCloseOperation(3);
        setLayout(null);
        JLabel lbl = new JLabel("Щелчок на кнопке приводит к закрытию окна");
        lbl.setBounds(10,30,300,50);
        add(lbl);
        JButton btn = new JButton("Закрыть окно");
        btn.setBounds(50,120,200,30);
        MyHandler hnd = new MyHandler();
        btn.addActionListener(hnd);
        add(btn);
        setVisible(true);
    }
}
