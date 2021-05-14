package hutnik.maksim.javaForJune.Listing_2;

import javax.swing.*;

class Listing_2_4_InputDoubleVariableDemo {
    public static void main(String[] args) {
        double heigth;
        double weight;
        double mass;
        String res;
        res = JOptionPane.showInputDialog("Ваш рост в метрах?");
        heigth = Double.parseDouble(res);
        res = JOptionPane.showInputDialog("Ваш вес в килограммах?");
        weight = Double.parseDouble(res);
        mass = weight / (Math.pow(heigth, 2));
        mass = Math.round(mass * 100) / 100.0;
        JOptionPane.showMessageDialog(null, "Индекс массы тела = " + mass);
    }
}
