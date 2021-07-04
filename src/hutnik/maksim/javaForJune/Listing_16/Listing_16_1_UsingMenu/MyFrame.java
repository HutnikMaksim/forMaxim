package hutnik.maksim.javaForJune.Listing_16.Listing_16_1_UsingMenu;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

class MyFrame extends JFrame implements ActionListener {
    private int state;
    private JPanel pnl;
    private Border bdr;
    private Color[] clr = new Color[3];
    private JButton btn;
    private JMenu content, view, program;
    private ImageIcon[] imgs;
    private String[] engNames = {"Fox", "Wolf", "Bear", "Enot"};
    private String[] cyrNames = {"Лиса", "Волк", "Медведь", "Енот"};
    private String[] files;
    private String path = "d:/Загрузки/Лекции по JAVA/";
    private JLabel lbl;
    private JTextPane tp;
    private JMenuBar mb;
    private JMenuItem about, exit;
    private JMenuItem[] animals;
    private JCheckBoxMenuItem color;
    private JRadioButtonMenuItem light, dark,ordinary;
    private JToolBar tb;
    private MyButton exitBtn, nextBtn, prevBtn, startBtn;
    private JPopupMenu pm;
    class MyButton extends JButton{
        MyButton(String txt){
            super(new ImageIcon(path + txt));
            setFocusPainted(false);
        }
    }
    private void setContent(){
        lbl.setIcon(imgs[state]);
        try {
            tp.setPage(files[state]);
        } catch(IOException err){
            tp.setText("Информация недоступна");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        state = Integer.parseInt(((JMenuItem)e.getSource()).getActionCommand());
        setContent();
    }
    MyFrame(){
        super("Окно с панелью меню");
        setBounds(250,250,350,330);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());
        state = 0;
        bdr = BorderFactory.createEtchedBorder();
        clr[0] = getBackground();
        clr[1] = Color.WHITE;
        clr[2] = Color.DARK_GRAY;
        imgs = new ImageIcon[engNames.length];
        files = new String[engNames.length];
        animals = new JMenuItem[cyrNames.length];
        for(int i = 0; i < engNames.length; i++) {
            imgs[i] = new ImageIcon(path + engNames[i] + ".png");
            files[i] = "file:///" + path + engNames[i] + ".txt";
        }
        tb = new JToolBar("Панель меню");
        exitBtn = new MyButton("exit.png");
        exitBtn.setToolTipText("Завершение работы");
        startBtn = new MyButton("start.png");
        startBtn.setToolTipText("Начальное изображение");
        prevBtn = new MyButton("prev.png");
        prevBtn.setToolTipText("Предыдущее изображение");
        nextBtn = new MyButton("next.png");
        nextBtn.setToolTipText("Следующее изображение");
        tb.add(exitBtn);
        tb.add(startBtn);
        tb.add(prevBtn);
        tb.add(nextBtn);
        add(tb, BorderLayout.NORTH);
        pnl = new JPanel();
        pnl.setBorder(bdr);
        pnl.setLayout(new GridLayout(1, 2));
        lbl = new JLabel();
        lbl.setHorizontalAlignment(JLabel.CENTER);
        pnl.add(lbl);
        add(pnl, BorderLayout.CENTER);
        JScrollPane sp = new JScrollPane();
        tp = new JTextPane();
        tp.setEditable(false);
        sp.getViewport().add(tp);
        pnl.add(sp);
        btn = new MyButton("OK");
        btn.setFocusPainted(false);
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1,3));
        p.setBorder(bdr);
        p.add(new JPanel());
        p.add(btn);
        p.add(new JPanel());
        add(p, BorderLayout.SOUTH);
        mb = new JMenuBar();
        content = new JMenu("Содержание");
        view = new JMenu("Вид");
        program = new JMenu("Программа");
        about = new JMenuItem("О программе");
        exit = new JMenuItem("Выход", exitBtn.getIcon());
        program.add(about);
        program.addSeparator();
        program.add(exit);
        color = new JCheckBoxMenuItem("Цвет панели", true);
        light = new JRadioButtonMenuItem("Светлый", false);
        dark = new JRadioButtonMenuItem("Тёмный", false);
        ordinary = new JRadioButtonMenuItem("Обычный", true);
        ButtonGroup bg = new ButtonGroup();
        bg.add(ordinary);
        bg.add(light);
        bg.add(dark);
        view.add(color);
        view.addSeparator();
        view.add(ordinary);
        view.add(light);
        view.add(dark);
        for(int i = 0; i < animals.length; i++) {
            animals[i] = new JMenuItem(cyrNames[i]);
            animals[i].setActionCommand("" + i);
            animals[i].addActionListener(this);
            content.add(animals[i]);
        }
        mb.add(content);
        mb.add(view);
        mb.add(program);
        setJMenuBar(mb);
        pm = new JPopupMenu();
        for(int i = 0; i < cyrNames.length; i++) {
            pm.add(new JMenuItem(cyrNames[i])).setActionCommand("" + i);
            ((JMenuItem)pm.getComponent(i)).addActionListener(this);
        }
        pm.addSeparator();
        pm.add(new JMenuItem("Выход", exitBtn.getIcon())).addActionListener(e -> exitBtn.doClick());
        lbl.setComponentPopupMenu(pm);
        btn.addActionListener(e -> System.exit(0));
        exitBtn.addActionListener(btn.getActionListeners()[0]);
        nextBtn.addActionListener(e -> {
            state = (state + 1) % (engNames.length);
            setContent();
        });
        prevBtn.addActionListener(e -> {
            state = state == 0 ? engNames.length - 1:(state - 1); // Тернарный оператор
            setContent();
        });
        startBtn.addActionListener(e -> {
            state = 0;
            setContent();
        });
        exit.addActionListener(exitBtn.getActionListeners()[0]);
        about.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                    "В программе используется панель меню\nи панель инстрментов",
                    "О программе",
                    JOptionPane.INFORMATION_MESSAGE);
        });
        lbl.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(e.isPopupTrigger()){
                    pm.show(e.getComponent(),e.getX(),e.getY());
                }
            }
        });
        color.addActionListener(e -> {
            if(color.isSelected()){
                ordinary.setEnabled(true);
                light.setEnabled(true);
                dark.setEnabled(true);
            } else {
                ordinary.setEnabled(false);
                light.setEnabled(false);
                dark.setEnabled(false);
            }
        });
        ordinary.addActionListener(e -> pnl.setBackground(clr[0]));
        light.addActionListener(e -> pnl.setBackground(clr[1]));
        dark.addActionListener(e -> pnl.setBackground(clr[2]));
        setContent();
        setVisible(true);
    }
}
