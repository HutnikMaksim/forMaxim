package hutnik.maksim.javaForJune.Listing_18.Listing_18_5_BufferedReaderWriter;

import java.io.*;

class BufferedReaderWriterDemo {
    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();
        System.out.println("Начинается копирование файла");
        String path = "d:/Загрузки/Лекции по JAVA/";
        String str;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path + "MyNewText.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path + "MyFiles/MyVeryNewText.txt"));
            int i = 1;
            while((str = bufferedReader.readLine()) != null){
                bufferedWriter.write("[" + i + "]" + str.toLowerCase());
                bufferedWriter.newLine();
                i++;
            }
            bufferedReader.close();
            bufferedWriter.close();
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
