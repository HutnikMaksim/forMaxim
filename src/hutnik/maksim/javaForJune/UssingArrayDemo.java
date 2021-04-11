package hutnik.maksim.javaForJune;

import javax.swing.*;

class UssingArrayDemo {
    public static void main(String[] args) {
        String input, title = "Определение биномиального коэффициента";
        input = JOptionPane.showInputDialog(null, "Ввод значения нижнего инжекса", title, 3);
        if(input == null){
            JOptionPane.showMessageDialog(null, "Не введено значение", title, 0);
            System.exit(0);
        }
        int n;
        n = Integer.parseInt(input);
        if(n < 0){
            JOptionPane.showMessageDialog(null, "Введено некоректное значение", title, 0);
            System.exit(0);
        }
        int[] binoms = new int[n + 1];
        binoms[0] = 1;
        String txt = "Содержание массива \n| " + binoms[0] + " | ";
        for (int m = 1; m < binoms.length; m++) {
            binoms[m] = binoms[m - 1] * (n - m + 1) / m;
            txt += binoms[m] + " | ";

        }
        JOptionPane.showMessageDialog(null, txt, title, 1);
    }
}
