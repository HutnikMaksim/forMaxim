package hutnik.maksim.javaForJune.Listing_13.Listing_13_7_ButtonAndHandler;

import javax.swing.*;

class ButtonAndHandlerDemo {
    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("d:/Загрузки/Лекции по JAVA/Sonya.jpg");
        String txt = "<html>Это Сонька.<br>Она прикольная.<br>Она не София.</html>";
        new MyFrame("Обработчик - объект кнопки", txt, img);
    }
}
