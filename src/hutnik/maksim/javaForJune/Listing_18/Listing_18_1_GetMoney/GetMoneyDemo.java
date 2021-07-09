package hutnik.maksim.javaForJune.Listing_18.Listing_18_1_GetMoney;

import javax.swing.*;

class GetMoneyDemo {
    public static void main(String[] args) {
        String name;
        double m;
        double r;
        int t;
        double val;
        try {
            name = args[0] + " " + args[1];
            m = Double.parseDouble(args[2]);
            r = Double.parseDouble(args[3]);
            t = Integer.parseInt(args[4]);
            val = m;
            for(int i = 1; i <= t; i++) {
                val *= (1 + r / 100);
            }
            val = ((int) (100 * val)) / 100.0;
            String txt = "Имя: " + name + "\n";
            txt += "Вклад: " + m + "\n";
            txt += "Ставка: " + r +"\n";
            txt += "Время: " + t + "\n";
            txt += "Итог: " + val;
            JOptionPane.showMessageDialog(null, txt, "Итоговая сумма по дипозиту", -1);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Неверно указаны параметры!\n" + e, "Ошибка", -1);
        }
    }
}
