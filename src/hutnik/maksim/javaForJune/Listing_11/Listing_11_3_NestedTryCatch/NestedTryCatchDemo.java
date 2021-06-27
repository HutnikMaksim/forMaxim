package hutnik.maksim.javaForJune.Listing_11.Listing_11_3_NestedTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

class NestedTryCatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] symbs;
        int size, index;
        try{
            System.out.println("Укажите размер массива");
            size = scanner.nextInt();
            symbs = new char[size];
            System.out.print("| ");
            for(int i = 0; i < size; i++) {
                symbs[i] = (char) ('A' + i);
                System.out.print(symbs[i] + " | ");
            }
            try{
                System.out.print("\nУкажите индекс: ");
                index = scanner.nextInt();
                System.out.println("Символ - " + symbs[index]);
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Такого элемента нет!");
            }
            finally {
                System.out.println("Массив создан успешно");
            }
            System.out.println("Для индекса указано числовое значение");
        } catch(InputMismatchException e){
            System.out.println("Ошибка: Вы не ввели число!");
        } catch(NegativeArraySizeException e){
            System.out.println("Неверный размер массива");
        }
        System.out.println("Выполнение программы завершено");
    }
}
