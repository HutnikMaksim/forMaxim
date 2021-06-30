package hutnik.maksim.javaForJune.Listing_14.Listing_14_3_HandlingTextField;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener, MouseListener, KeyListener {
    private JLabel L;
    private JTextField T;
    private JButton B;
    private String name = "Arial";
    private int size = 15;
    private String exit = "Закрыть";

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {
        L.setText(T.getText());
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() == L){
            L.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            L.setHorizontalAlignment(JLabel.RIGHT);
        } else {
            B.setText("<html><u>" + exit + "</u></html");
            B.setForeground(Color.RED);
            B.setFont(new Font(name, Font.BOLD, size + 4));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == L){
            L.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
            L.setHorizontalAlignment(JLabel.LEFT);
        } else {
            B.setText(exit);
            B.setForeground(Color.BLUE);
            B.setFont(new Font(name, Font.PLAIN, size));
        }
    }
    MyFrame(){
        super("Окно с текстовым полем");
            setBounds(250,250,310,160);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);
            setLayout(null);
            L = new JLabel();
            L.setBounds(10,10,275,30);
            L.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
            L.addMouseListener(this);
            T = new JTextField();
            T.setBounds(10,50,275,30);
            T.addKeyListener(this);
            B = new JButton(exit);
            B.setBounds(60,90,175,30);
            B.setFocusPainted(false);
            B.setFont(new Font(name, Font.PLAIN, size));
            B.setForeground(Color.BLUE);
            B.addActionListener(this);
            B.addMouseListener(this);
            add(L);
            add(T);
            add(B);
            setVisible(true);
    }
}
