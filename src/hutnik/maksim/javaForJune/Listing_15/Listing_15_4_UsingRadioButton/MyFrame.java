package hutnik.maksim.javaForJune.Listing_15.Listing_15_4_UsingRadioButton;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame extends JFrame implements ItemListener {
    private JRadioButton[] RB;
    private JButton B;
    private JLabel L;
    private String[] animal = new String[]{"Лиса", "Волк", "Медведь", "Енот"};
    private String[] files = new String[]{"FoxBig.png", "WolfBig.png", "BearBig.png", "EnotBig.png"};
    private String path = "d:/Загрузки/Лекции по JAVA/";
    private ImageIcon[] imgs;
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        for(int i = 0; i < RB.length; i++) {
            if(RB[i].isSelected()){
                L.setIcon(imgs[i]);
                break;
            }
        }
    }
    MyFrame(){
        super("Группа переключателей");
        setBounds(250,250,310,190);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        imgs = new ImageIcon[files.length];
        for(int i = 0; i < imgs.length; i++) {
            imgs[i] = new ImageIcon(path + files[i]);
        }
        L = new JLabel(imgs[0]);
        L.setBounds(10,10,150,100);
        L.setBorder(BorderFactory.createEtchedBorder());
        add(L);
        JLabel lbl = new JLabel("Сделайте выбор");
        lbl.setBounds(170,10,120,20);
        add(lbl);
        ButtonGroup BG = new ButtonGroup();
        RB = new JRadioButton[animal.length];
        for(int i = 0; i < RB.length; i++) {
            RB[i] = new JRadioButton(animal[i]);
            BG.add(RB[i]);
            RB[i].setBounds(170, 31 + 21 * i, 120, 20);
            RB[i].addItemListener(this);
            add(RB[i]);
        }
        RB[0].setSelected(true);
        B = new JButton("OK");
        B.setBounds(90,120,120,30);
        B.addActionListener(e -> System.exit(0));
        add(B);
        setVisible(true);
    }
}
