package hutnik.maksim.javaForJune.Listing_15.Listing_15_5_SpinnerAndSlider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Hashtable;

class MyFrame extends JFrame implements ItemListener, ChangeListener {
    private JSpinner SP;
    private JSpinner.DefaultEditor editor; // Стандартный редактор спиннера
    private String nameOfFont = "Arial";
    private int size = 15;
    private JSlider SL;
    private JToggleButton TB;
    private String pressed = "Заблокировать";
    private String unpressed = "Разблокировать";
    private ImageIcon locked, unlocked;
    private JCheckBox IT, BL;
    private JButton B;
    private JLabel L;
    private String[] animal = new String[]{"Лиса", "Волк", "Медведь", "Енот"};
    private String[] files = new String[]{"FoxBig.png", "WolfBig.png", "BearBig.png", "EnotBig.png"};
    private final String path = "d:/Загрузки/Лекции по JAVA/";
    private ImageIcon[] imgs;
    private void setSpinnerFont(){
        int style = Font.PLAIN; // Инициализация стандартного шрифта, можно и так: int style = 0;
        if(IT.isSelected()){ // Если выбран шрифт ITALIC
            style |= Font.ITALIC; // Тоже самое, что style = style|Font.ITALIC; результат: Font.PLAIN|Font.ITALIC
        }
        if(BL.isSelected()){ // Если выбран шрифт BOLD
            style |= Font.BOLD; // style = Font.PLAIN|Font.BOLD
        }
        /* Применение шрифта Ariel, обычный, кегль 15, к полю спиннера с помощью стандартного редактора спиннера */
        editor.getTextField().setFont(new Font(nameOfFont, style,size));
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        setSpinnerFont(); // При изменении состояния спиннера, обращаемся к методу setSpinnerFont()
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int i;
        String s;
        if(e.getSource() == SP){
            s = (String) SP.getValue();
            for(i = 0; i < animal.length; i++) {
                if(animal[i].equals(s)){
                    SL.setValue(i);
                    break;
                }
            }
        } else {
            i = SL.getValue();
            SP.setValue(animal[i]);
        }
        L.setIcon(imgs[i]);
    }
    MyFrame(){
        super("Спиннер и слайдер"); // Заголовок главного окна программы
        setBounds(250,250,400,210); // Положение и размер главного окна
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Определение кнопок действия главного окна (в правом верхнем углу)
        setResizable(false); // Запрет на изменение размеров главного окна
        setLayout(null); // Отключение встроеного менеджера компоновки главного окна
        JPanel pnl = new JPanel(); //Создание панели для размещения метки с картинками и кнопки "ОК"
        pnl.setBounds(10,10,170,160); // Задание положения панели
        pnl.setLayout(null); // Отключение встроеного менеджера компоновки панели
        pnl.setBorder(BorderFactory.createEtchedBorder()); // Задание  рамки панели (вдавленная)
        imgs = new ImageIcon[files.length]; // Создание массива картинок
        for(int i = 0; i < imgs.length; i++) {
            imgs[i] = new ImageIcon(path + files[i]);
        }
        L = new JLabel(imgs[0]); // Инициализация метки для картинок
        L.setBounds(10,10,150,100); // Положение и размер метки
        pnl.add(L); // Добавление метки на панель
        B = new JButton("OK"); // Инициализация кнопки"ОК"
        B.setBounds(10,120,150,30); // Положение и размер кнопки "ОК"
        B.setFocusPainted(false); // Снятие фокусировки на кнопке
        B.setToolTipText("Ничёссе!!!");
        B.addActionListener(e -> System.exit(0)); // Инициализация действия при клике мышкой на кнопке "ОК"
        pnl.add(B); // Добавление кнопки на панель
        add(pnl); // Добавление панели в главное окно программы
        JTabbedPane tp = new JTabbedPane(); // Создание панели с вкладками
        tp.setBounds(190,10,190,160); // Положение и размеры панели с вкладками
        JPanel onePnl = new JPanel(); // Создание 1-й подпанели на панели с вкладками
                                      // положение и размеры указывать не нужно, т.к. панель, размещаемая во вкладке,
                                      // автоматически масштабируется в соответствии с размерами объекта tp
        onePnl.setLayout(null); // Отключение встроеного менеджера компоновки 1-й подпанели
        SpinnerModel sm = new SpinnerListModel(animal); /* Перед созданием Спиннера, необходимо задать модель его поведения.
                                                           Здесь рассмотрена одна из стандартых моделей поведения,
                                                           основанная на классе SpinnerModel. Аргументом конструктору
                                                           класса SpinnerListModel(animal) передаётся текстовый массив с
                                                           названиями животных.*/
        SP = new JSpinner(sm); // Создание спиннера, аргументом которому передаётся модель его поведение JSpinner(sm)
        SP.setBounds(5,5,170,30); // Положение и размеры спиннера
        editor = (JSpinner.DefaultEditor) SP.getEditor();
        editor.getTextField().setHorizontalAlignment(JTextField.CENTER);
        editor.getTextField().setEditable(false);
        SP.setValue(animal[0]);
        SP.addChangeListener(this);
        onePnl.add(SP);
        IT = new JCheckBox("Применить курсив");
        IT.setBounds(5,35,170,25);
        //IT.setSelected(true);
        IT.addItemListener(this);
        onePnl.add(IT);
        BL = new JCheckBox("Жирный шрифт");
        BL.setBounds(5,65,170,25);
        BL.setSelected(true);
        BL.addItemListener(this);
        onePnl.add(BL);
        TB = new JToggleButton(unpressed);
        TB.setBounds(5,95,170,30);
        locked = new ImageIcon(path + "Stop.png");
        unlocked = new ImageIcon(path + "Go.png");
        TB.setIcon(locked);
        TB.setSelectedIcon(unlocked);
        TB.addActionListener(e -> {
            if(TB.isSelected()){
                TB.setText(pressed);
                editor.getTextField().setEditable(true);
            } else {
                TB.setText(unpressed);
                editor.getTextField().setEditable(false);
            }
        });
        onePnl.add(TB);
        setSpinnerFont();
        tp.add("Спиннер", onePnl);
        JPanel twoPnl =new JPanel();
        twoPnl.setLayout(null);
        SL = new JSlider(JSlider.VERTICAL, 0,3,1);
        SL.setBounds(5,5,100,120);
        Hashtable ht = new Hashtable();
        for(int i = 0; i < animal.length; i++) {
            //ht.put(new Integer(i), new JLabel(animal[i]));
            ht.put(i, new JLabel(animal[i]));
        }
        SL.setLabelTable(ht);
        SL.setInverted(true);
        SL.setMajorTickSpacing(1);
        SL.setPaintTicks(true);
        SL.setPaintLabels(true);
        SL.setValue(0);
        SL.addChangeListener(this);
        twoPnl.add(SL);
        tp.add("Слайдер", twoPnl);
        add(tp);
        setVisible(true);
    }
}
