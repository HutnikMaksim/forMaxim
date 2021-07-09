package hutnik.maksim.javaForJune.Listing_18.Listing_18_6_FileChooser;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileChooserDemo {
    public static void main(String[] args) throws IOException {
        int res = JOptionPane.showConfirmDialog(null,
                                                "Готовы выбрать файл?",
                                                "Работа с файлами",
                                                JOptionPane.YES_NO_OPTION,
                                                JOptionPane.QUESTION_MESSAGE);
        if(res != JOptionPane.YES_OPTION){
            System.exit(0);
        }
        JFileChooser fch = new JFileChooser();
        res = fch.showOpenDialog(null);
        if(res != JFileChooser.APPROVE_OPTION){
            System.exit(0);
        }
        File F = fch.getSelectedFile();
        String txt = "Вы выбрали файл\n";
        txt += F.getAbsolutePath();
        txt += "\nХотите создать копию?";
        res = JOptionPane.showConfirmDialog(null,
                                            txt,
                                            "Файл выбран",
                                            JOptionPane.YES_NO_OPTION,
                                            JOptionPane.QUESTION_MESSAGE);
        if(res != JOptionPane.YES_OPTION){
            System.exit(0);
        }
        res = fch.showSaveDialog(null);
        if(res != JFileChooser.APPROVE_OPTION){
            System.exit(0);
        }
        FileInputStream inputStream = new FileInputStream(F);
        F = fch.getSelectedFile();
        FileOutputStream outputStream = new FileOutputStream(F);
        while((res = inputStream.read()) != -1){
            outputStream.write(res);
        }
        inputStream.close();
        outputStream.close();
        JOptionPane.showMessageDialog(null,
                                      "Копия сохранена как\n" + F.getAbsolutePath(),
                                      "Создана копия файла", JOptionPane.INFORMATION_MESSAGE);
    }
}
