package hutnik.maksim.javaForJune.Listing_18.Listing_18_3_FileInputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class FileInputOutputDemo {
    public static void main(String[] args) {
        System.out.println("Начинается копирование файла");
        String path = "d:/Загрузки/Лекции по JAVA/";
        int bt;
        try {
            FileInputStream inputStream = new FileInputStream(path + "MyFiles/Max.docx");
            FileOutputStream fileOutputStream = new FileOutputStream(path + "MyData.docx");
            bt = inputStream.read();
            while(bt != -1){
                fileOutputStream.write(bt);
                bt = inputStream.read();
            }
            inputStream.close();
            fileOutputStream.close();
        } catch(FileNotFoundException e){
            System.out.println("Файл не найден: " + e);
        } catch(IOException e){
            System.out.println("Ошибка доступа к файлу: " + e);
        }
        System.out.println("Копирование завершено");

    }
}
