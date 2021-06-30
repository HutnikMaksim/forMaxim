package hutnik.maksim.javaForJune.Listing_14.Listing_14_2_MoreTextField;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyFrame extends JFrame implements ActionListener, MouseListener {
    private JLabel L;
    private JTextField T;
    private String apply = "Применить";
    private String exit = "Закрыть";

    @Override
    public void actionPerformed(ActionEvent e) {
        /* Здесь переменной txt присваивается значение результат выражения e.getActionCommand(), где
        * е - аргумент метода - ссылка на объект события класса ActionEvent. Из этотго объекта
        * вызывается метод getActionCommand(). Результатом этот метод возвращает текстовое значение,
        * представляющее собой командную строку, ассоциируемую с компонентом, на котором (с которым)
        * произошло событие. Для кнопок командной строкой (по умолчанию) является название,
        * отображаемое на кнопке */
        String txt = e.getActionCommand();
        if(txt.equals(apply)){
            L.setText(T.getText());
        } else {
            System.exit(0);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        L.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        L.setHorizontalAlignment(JLabel.LEFT);
        L.setForeground(Color.WHITE);
        L.setBackground(Color.getColor("dark blue", 1199));
        L.setOpaque(true);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        L.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        L.setHorizontalAlignment(JLabel.RIGHT);
        L.setForeground(Color.BLUE);
        L.setBackground(Color.yellow);
        L.setOpaque(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    MyFrame(){
        super("Окно с текстовым полем");
        int w = 300, h = 160;
        setBounds(250,250,w,h);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        L = new JLabel();
        L.setBounds(10,10,w - 35, 30);
        L.setBorder(BorderFactory.createBevelBorder(1));
        L.addMouseListener(this);
        T = new JTextField();
        T.setBounds(L.getX(),50,L.getWidth(),30);
        int bw = (T.getWidth() - 20) / 2;
        JButton appB = new JButton(apply);
        appB.setBounds(T.getX(),90,bw,30);
        appB.setFocusPainted(false);
        appB.addActionListener(this);
        appB.addMouseListener(this);
        JButton extB = new JButton(exit);
        extB.setBounds(appB.getX() + appB.getWidth() + 20, appB.getY(), appB.getWidth(),appB.getHeight());
        extB.setFocusPainted(false);
        extB.addActionListener(this);
        add(L);
        add(T);
        add(appB);
        add(extB);
        setVisible(true);
    }


}
