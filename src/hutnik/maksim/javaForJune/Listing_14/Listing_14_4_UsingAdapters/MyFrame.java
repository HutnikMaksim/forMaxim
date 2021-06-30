package hutnik.maksim.javaForJune.Listing_14.Listing_14_4_UsingAdapters;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame {
    private JLabel L;
    private JTextField T;
    private JButton B;
    private String txt = "Arial";
    private int size  = 15;
    private String exit  = "Закрыть";
    MyFrame(){
        super("Окно с текстовым полем");
        setBounds(250,250,300,160);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        L = new JLabel();
        L.setBounds(10,10,285,30);
        L.setBorder(BorderFactory.createBevelBorder(1));
        L.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                L.setBorder(BorderFactory.createBevelBorder(0));
                L.setHorizontalAlignment(JLabel.RIGHT);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                L.setBorder(BorderFactory.createBevelBorder(1));
                L.setHorizontalAlignment(JLabel.LEFT);
            }
        });
        T = new JTextField();
        T.setBounds(10,50,275,30);
        T.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                L.setText(T.getText());
            }
        });
        B = new JButton(exit);
        B.setBounds(60,90,175,30);
        B.setFocusPainted(false);
        B.setForeground(Color.BLUE);
        B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        B.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                B.setText(exit);
                B.setForeground(Color.BLUE);
                B.setFont(new Font(txt,Font.PLAIN,size));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                B.setText("<html><u><i>" + exit + "</i></u></html>");
                B.setForeground(Color.red);
                B.setFont(new Font(txt, Font.BOLD, size + 2));
            }
        });
        add(L);
        add(T);
        add(B);
        setVisible(true);
    }
}
