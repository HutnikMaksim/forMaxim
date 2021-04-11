package hutnik.maksim.javaForJune;

import javax.swing.*;

class Multi_if {
    public static void main(String[] args) {
        String input, txt, file, Sonya, Maxim, Natasha, Katz;
        ImageIcon img;
        file = "d:/Загрузки/Лекции по JAVA/";
        Sonya = "Соня";
        Natasha = "Наташа";
        Maxim = "Максим";
        Katz = "Кац";
        input = JOptionPane.showInputDialog(null, "Введи имя (" + Sonya + "," + Natasha + "," + Maxim + " или " + Katz + ")",
                "Выбор имени", 3);
        if(input == null){
            JOptionPane.showMessageDialog(null, "Не введено имя", "Ошибка", 0);
            System.exit(0);
        }
        if(input.equalsIgnoreCase(Sonya)){
            txt = "Сонька";
            file += "Sonya.jpg";
        }
        else if(input.equalsIgnoreCase(Natasha)){
            txt = "Наташка";
            file += "Natasha.jpg";
        }
        else if(input.equalsIgnoreCase(Maxim)){
            txt = "Максим";
            file += "Maxim.jpg";
        }
        else{
            txt = "Кац";
            file += "Katz.jpg";
        }
        img = new ImageIcon(file);
        JOptionPane.showMessageDialog(null, img, txt, -1);
    }
}
