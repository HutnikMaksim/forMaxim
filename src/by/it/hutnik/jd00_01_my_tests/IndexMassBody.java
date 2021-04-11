package by.it.hutnik.jd00_01_my_tests;

import javax.swing.*;

class IndexMassBody {
    public static void main(String[] args) {
        double mass, heigh, bmi;
        String res;
        res = JOptionPane.showInputDialog("Ваш рост в метрах:");
        heigh = Double.parseDouble(res);
        res = JOptionPane.showInputDialog("Ваш вес в килограммах:");
        mass = Double.parseDouble(res);
        bmi = mass/heigh/heigh;
        bmi = Math.round(bmi * 100)/100.0;
        JOptionPane.showMessageDialog(null,"Ваш индекс массы тела:" + bmi);
    }
}
