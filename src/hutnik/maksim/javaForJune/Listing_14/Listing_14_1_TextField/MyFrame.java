package hutnik.maksim.javaForJune.Listing_14.Listing_14_1_TextField;

import javax.swing.*;
import javax.swing.border.BevelBorder;

class MyFrame extends JFrame {
    private JLabel L;
    private JTextField T;
    MyFrame(){
        super("Окно с текстовым полем");
        int w = 300, h = 160;
        setBounds(250,250,w,h);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        L = new JLabel();
        L.setBounds(10,10,w-35,30);
        L.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        T = new JTextField();
        T.setBounds(L.getX(),L.getY() + L.getHeight() + 5,L.getWidth(),L.getHeight());
        // Переменной bw задаётся общая ширина кнопок. Ширина поля ввода минус промежуток между кнопками (5) делится пополам.
        // Таким образом получается создать две кнопки одинакового размера. При этом они выровнены по краям созданного
        // ранее поля ввода, а промежуток между самими кнопками определён в инструкции *(T.getWidth() - 5) / 2* как 5
        // Что очень удобно и не нужно будет каждый раз подгонять размеры кнопок под ширину поля ввода
        int bw = (T.getWidth() - 5) / 2;
        JButton appB = new JButton("Применить");
        appB.setBounds(T.getX(),T.getY() + T.getHeight() + 5,bw,30);
        appB.setFocusPainted(false);
        appB.addActionListener(e -> L.setText(T.getText()));
        JButton extB = new JButton("Закрыть");
        extB.setBounds(appB.getX() + appB.getWidth() + 5,appB.getY(),bw,appB.getHeight());
        extB.setFocusPainted(false);
        extB.addActionListener(e -> System.exit(0));
        add(L);
        add(T);
        add(appB);
        add(extB);
        setVisible(true);
    }
}
