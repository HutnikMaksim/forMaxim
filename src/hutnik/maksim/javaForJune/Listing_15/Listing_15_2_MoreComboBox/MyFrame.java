package hutnik.maksim.javaForJune.Listing_15.Listing_15_2_MoreComboBox;

import javax.swing.*;

import static javax.swing.BorderFactory.*;

class MyFrame extends JFrame {
    private JComboBox CB;
    private JLabel L;
    private JButton B;
    private String[] animal = new String[]{"Лиса", "Волк", "Медведь", "Енот"};
    private String[] files = new String[]{"FoxBig.png", "WolfBig.png", "BearBig.png", "EnotBig.png"};
    private String path = "d:/Загрузки/Лекции по JAVA/";
    private ImageIcon[] imgs = new ImageIcon[files.length];
    MyFrame(){
        super("Раскрывающийся список");
        setBounds(250,250,315,160);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        for(int i = 0; i < imgs.length; i++) {
            imgs[i] = new ImageIcon(path + files[i]);
        }
        CB = new JComboBox(imgs);
        CB.setBounds(10,10,150,100);
        CB.setSelectedIndex(0);
        CB.addItemListener(e->L.setText(animal[CB.getSelectedIndex()]));
        add(CB);
        JLabel lbl = new JLabel("Ваш выбор");
        lbl.setBounds(170,10,120,20);
        add(lbl);
        L = new JLabel(animal[0], JLabel.CENTER);
        L.setBounds(170,40,120,30);
        L.setBorder(createEtchedBorder());
        add(L);
        B = new JButton("OK");
        B.setBounds(170,80,120,30);
        B.addActionListener(e -> System.exit(0));
        add(B);
        setVisible(true);
    }
}
