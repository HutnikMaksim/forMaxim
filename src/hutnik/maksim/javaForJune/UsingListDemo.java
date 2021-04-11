package hutnik.maksim.javaForJune;

import javax.swing.*;

class UsingListDemo {
    public static void main(String[] args) {
        String[] txt = {"Соня", "Наташа", "Максим", "Кац"};
        String[] files = {"Sonya.jpg", "Natasha.jpg", "Maxim.jpg", "Katz.jpg"};
        String dir = "d:/Загрузки/Лекции по JAVA/";
        String msg = "Кого показать?";
        String title = "Выбор фотографии";
        ImageIcon img = new ImageIcon(dir + "Sonya2.png");
        String man = (String) JOptionPane.showInputDialog(null, msg, title, -1, img, txt, txt[0]);
        if(man == null){
            System.exit(0);
        }
        for (int i = 0; i < txt.length; i++) {
            if(man.equals(txt[i])){
                img = new ImageIcon(dir + files[i]);
                break;
            }
        }
        JOptionPane.showMessageDialog(null, img, man, -1);
    }
}
