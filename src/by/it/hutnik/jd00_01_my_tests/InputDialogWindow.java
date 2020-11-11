package by.it.hutnik.jd00_01_my_tests;

import javax.swing.*;

public class InputDialogWindow {
    public static void main(String[] args) {
        String text;
        text = JOptionPane.showInputDialog("Введите текст:");
        JOptionPane.showMessageDialog(null, "Ваш текст:\n" + text);
    }
}
