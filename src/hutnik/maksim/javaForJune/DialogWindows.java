package hutnik.maksim.javaForJune;

import javax.swing.*;

public class DialogWindows {
    public static void main(String[] args) throws InterruptedException {
        String text;
        String title;
//        JOptionPane.showMessageDialog(null,"Fuck off");
//        Thread.sleep(500);
//        JOptionPane.showConfirmDialog(null, "Конфигурация -1", "Заголовок окна", -1);
        /*
        появится диалоговое окно со знаком вопроса в зелёном квадрате Титл окна "Заголовок окна".
        Сообщение окна "Конфигурация -1". Окно с единственной кнопкой "OK"
         */
        //JOptionPane.showConfirmDialog(null, "Конфигурация 0", "Второй вариант", 0);
        /*
        появится диалоговое окно со знаком вопроса в зелёном квадрате Титл окна "Второй вариант".
        Сообщение окна "Конфигурация 0". Окно с кнопками "Yes" и "No"
         */
       // JOptionPane.showConfirmDialog(null, "Конфигурация 1", "Третий вариант", 1);
        /*
        появится диалоговое окно со знаком вопроса в зелёном квадрате Титл окна "Третий вариант".
        Сообщение окна "Конфигурация 1". Окно с кнопками "Yes", "No" и "Cancel"
         */
        //JOptionPane.showConfirmDialog(null, "Конфигурация 2", "Четвёрый вариант", 2);
        /*
        появится диалоговое окно со знаком вопроса в зелёном квадрате Титл окна "Четвёрый вариант".
        Сообщение окна "Конфигурация 2". Окно с кнопками "OK" и "Cancel"
         */
//        text = JOptionPane.showInputDialog("Введи текст");
//        JOptionPane.showMessageDialog(null, "Я ввёл всякую хренотень \n для разнообразия полученных \n данных и возможно просмотра количества \n строк в сообщении \n" + text);
//        JOptionPane.showMessageDialog(null, "Alarm", "Title",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Warning", "Title",JOptionPane.WIDTH);
//        JOptionPane.showMessageDialog(null, "Alarm", "Title",JOptionPane.ERROR_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Alarm", "Title",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Alarm", "Title",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Alarm", "Title",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Alarm", "Title",JOptionPane.CANCEL_OPTION);
//        JOptionPane.showMessageDialog(null, "Alarm", "Title",JOptionPane.DEFAULT_OPTION);
//        JOptionPane.showMessageDialog(null, "Alarm", "Title",JOptionPane.WHEN_IN_FOCUSED_WINDOW);
        title = JOptionPane.showInputDialog(null,"Имя для окна", "Название", 2);
        text = JOptionPane.showInputDialog(null,"Текст сообщения", "Содержание", -1);
        JOptionPane.showMessageDialog(null,text,title,1);

    }
}
