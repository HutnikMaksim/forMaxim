package hutnik.maksim.javaForJune.Listing_13.Listing_13_6_WindowsAsHanler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    MyFrame(String name){
        super(name);
        setBounds(250,250,370,445);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        JPanel pnl = new JPanel();
        pnl.setBounds(5,5,345,395);
        pnl.setBorder(BorderFactory.createEtchedBorder());
        pnl.setLayout(null);
        ImageIcon img = new ImageIcon("d:/Загрузки/Лекции по JAVA/Sonya.jpg");
        String txt = "<html>Это Сонька.<br>Она прикольная.<br>Она не София.</html>";
        JLabel imgLbl = new JLabel(img);
        imgLbl.setBounds(10,10,160,280);
        imgLbl.setBorder(BorderFactory.createEtchedBorder());
        JLabel txtLbl = new JLabel(txt, JLabel.CENTER);
        txtLbl.setBounds(175,10,160,280);
        txtLbl.setBorder(BorderFactory.createBevelBorder(1, Color.BLUE, Color.MAGENTA));
        JButton btn = new JButton("Закрыть окно");
        btn.setBounds(75,320,200,30);
        btn.setFocusPainted(false);
        btn.addActionListener(this);
        Font F = new Font(btn.getFont().getName(),Font.BOLD|Font.ITALIC,btn.getFont().getSize()+4);
        txtLbl.setFont(F);
        pnl.add(imgLbl);
        pnl.add(txtLbl);
        add(pnl);
        add(btn);
        setVisible(true);
    }
}
