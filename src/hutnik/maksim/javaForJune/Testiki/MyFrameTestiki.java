package hutnik.maksim.javaForJune.Testiki;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrameTestiki extends JFrame implements ItemListener, ChangeListener {

    private String[] eventsis = {"uno", "due", "tre", "quattro", "cinque"};
    private JSpinner.DefaultEditor editor;

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
    MyFrameTestiki(){
        super("Window");
        setBounds(300,300,800,600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        SpinnerModel sm = new SpinnerListModel(eventsis);
        JSpinner SP = new JSpinner(sm);
        SP.setValue(eventsis[0]);
        editor = (JSpinner.DefaultEditor) SP.getEditor();
        editor.getTextField().setHorizontalAlignment(JTextField.CENTER);
        editor.getTextField().setEditable(false);
        SP.setBounds(10,10,300,100);
        add(SP);
        setVisible(true);
    }
}
