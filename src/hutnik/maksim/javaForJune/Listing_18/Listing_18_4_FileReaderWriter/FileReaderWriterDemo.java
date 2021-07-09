package hutnik.maksim.javaForJune.Listing_18.Listing_18_4_FileReaderWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileReaderWriterDemo {
    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();
        System.out.println("Начинается копирование файла");
        String path = "d:/Загрузки/Лекции по JAVA/";
        int sm;
        try {
            FileReader fileReader = new FileReader(path + "MyFiles/MyText.txt");
            FileWriter fileWriter = new FileWriter(path + "MyNewText.txt");
            sm = fileReader.read();
            while(sm != -1){
                fileWriter.write(Character.toUpperCase((char)sm));
                //fileWriter.write((char)sm); // Если так то перевода на заглавные буквы не будет
                sm = fileReader.read();
            }
            fileReader.close();
            fileWriter.close();
        } catch(FileNotFoundException e){
            System.out.println("Файл не найден" + e);
        } catch(IOException e){
            System.out.println("Ошибка доступа к файлу" + e);
        }
        System.out.println("Копирование файла завершено");
        long timeStop = System.currentTimeMillis() - timeStart;
        System.out.println(timeStop);
    }
}
