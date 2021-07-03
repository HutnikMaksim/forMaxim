package hutnik.maksim.javaForJune.Listing_15.Listing_15_3_UsingList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class MyFrame extends JFrame implements ListSelectionListener {
    private JList LS;
    private JButton B;
    private JLabel L;
    private String[] animal = new String[]{"Лиса", "Волк", "Медведь", "Енот"};
    private String[] files = new String[]{"FoxBig.png", "WolfBig.png", "BearBig.png", "EnotBig.png"};
    private String path = "d:/Загрузки/Лекции по JAVA/";
    private ImageIcon[] imgs;

    @Override
    public void valueChanged(ListSelectionEvent e) {
        L.setIcon(imgs[LS.getSelectedIndex()]);
    }
    MyFrame(){
        super("Список выбора");
        setBounds(250,250,310,195);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        imgs  =new ImageIcon[files.length];
        for(int i = 0; i < imgs.length; i++) {
            imgs[i] = new ImageIcon(path + files[i]);
        }
        L = new JLabel(imgs[0]);
        L.setBounds(10,10,150,100);
        add(L);
        JLabel lbl = new JLabel("Сделайте выбор");
        lbl.setBounds(170,10,120,20);
        add(lbl);
        LS = new JList(animal);
        LS.setBounds(170,10,120,75);
        LS.addListSelectionListener(this);
        LS.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        LS.setSelectedIndex(0);
        add(LS);
        B = new JButton("OK");
        B.setBounds(90,120,120,30);
        B.addActionListener(e -> System.exit(0));
        add(B);
        setVisible(true);
    }
}
