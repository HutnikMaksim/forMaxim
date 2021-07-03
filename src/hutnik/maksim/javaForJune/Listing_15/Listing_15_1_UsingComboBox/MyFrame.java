package hutnik.maksim.javaForJune.Listing_15.Listing_15_1_UsingComboBox;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame extends JFrame implements ItemListener {
    private JComboBox CB;
    private JButton B;
    private JLabel L;
    private String[] animals = new String[]{"Лиса", "Волк", "Медведь", "Енот"};
    private String[] files = new String[]{"FoxBig.png", "WolfBig.png", "BearBig.png", "EnotBig.png"};
    private String path = "d:/Загрузки/Лекции по JAVA/";
    private ImageIcon[] imgs = new ImageIcon[files.length];

    @Override
    public void itemStateChanged(ItemEvent e) {
        L.setIcon(imgs[CB.getSelectedIndex()]);
    }
    MyFrame(){
        super("Раскрывающийся список");
        setBounds(250,250,310,160);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //imgs = new ImageIcon[files.length];
        for(int i = 0; i < imgs.length; i++) {
            imgs[i] = new ImageIcon(path + files[i]);
        }
        L= new JLabel(imgs[0]); // задаётся начальная картинка в Label
        L.setBounds(10,10,150,100);
        //L.setBorder(BorderFactory.createEtchedBorder(1));
        add(L);
        JLabel lbl = new JLabel("Сделайте выбор");
        lbl.setBounds(170,10,120,20);
        add(lbl);
        CB = new JComboBox(animals);
        CB.setBounds(170,40,120,30);
        // Задаётся начальное название животного в ComboBox (должно соответствовать начальной картинке в Label)
        CB.setSelectedIndex(0);
        CB.addItemListener(this);
        add(CB);
        B = new JButton("OK");
        B.setBounds(170,80,120,30);
        B.addActionListener(e -> System.exit(0));
        add(B);
        setVisible(true);
    }
}
