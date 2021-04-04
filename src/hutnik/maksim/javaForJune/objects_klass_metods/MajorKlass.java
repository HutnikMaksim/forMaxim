package hutnik.maksim.javaForJune.objects_klass_metods;

import javax.swing.*;

public class MajorKlass {
    public static void main(String[] args) {
        MetodKlass metodKlass1 = new MetodKlass();
        MetodKlass metodKlass2 = new MetodKlass();
        metodKlass1.setDouble(1, 'F');
        metodKlass2.setDouble(2, 'R');
        JOptionPane.showMessageDialog(null, metodKlass1.getInfo(), "Title", 2);
        String texte = metodKlass1.getInfo() + " Upload";
        JOptionPane.showMessageDialog(null, metodKlass2.getInfo() + "\n" +  texte, "Title 2",  0);
    }
}
