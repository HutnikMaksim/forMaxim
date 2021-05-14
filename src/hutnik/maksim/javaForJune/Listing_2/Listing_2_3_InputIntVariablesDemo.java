package hutnik.maksim.javaForJune.Listing_2;

import by.it.hutnik.jd02_05.Message;

import javax.swing.*;

class Listing_2_3_InputIntVariablesDemo {
    public static void main(String[] args) {
        int year;
        int born;
        int age;
        String res;
        res = JOptionPane.showInputDialog(null, "Какой сейчас год?", "Input", JOptionPane.QUESTION_MESSAGE);
        year = Integer.parseInt(res);
        res = JOptionPane.showInputDialog(null, "Сколько Вам лет?", "Input", 3);
        born = Integer.parseInt(res);
        age = year - born;
        JOptionPane.showMessageDialog(null, "Вы родились в " + age + " году", "Message", 1);
    }
}
