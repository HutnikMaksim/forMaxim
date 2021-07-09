package hutnik.maksim.javaForJune.Listing_18.Listing_18_2_GetFileInfo;

import java.io.File;
import java.io.IOException;

class GetFileInfoDemo {
    public static void main(String[] args) {
        String path = "d:/Загрузки/Лекции по JAVA/Test.txt";
        System.out.println(path);
        File F = new File(path);
        System.out.println("Имя файла: " + F.getName());
        System.out.println("Директория: " + F.getParent());
        File[] files = F.getParentFile().listFiles();
        System.out.println("Содержимое папки:");
        for(int i = 0; i < files.length; i++) {
            System.out.print("\t" + files[i].getName());
            if(files[i].isFile()){
                System.out.println(" - файл");
            } else {
                System.out.println(" - директория");
            }
        }
        System.out.println("Создание новой директории и перемещение файла");
        File D = new File(F.getParentFile(), ".\\MyFiles");
        D.mkdir();
        try {
            System.out.println("Создана директория " + D.getCanonicalPath());
        } catch(IOException e){
            System.out.println("Ошибка " + e);
        }
        F.renameTo(new File(D,"MyCV.pdf"));
        System.out.print("Файл " + F.getAbsolutePath());
        if(F.exists()){
            System.out.println(" суыуществует!");
        } else {
            System.out.println(" не существует!");
        }
        System.out.println("В директории " + D.getPath() + " есть файлы:");
        files = D.listFiles();
        for(int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName());
        }
    }
}
