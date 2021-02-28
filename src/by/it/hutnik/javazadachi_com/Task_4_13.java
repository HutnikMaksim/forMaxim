package by.it.hutnik.javazadachi_com;

import by.it._examples_.jd01_13.Class06_Throw_example;

import java.util.Arrays;
import java.util.Scanner;

/*
Потом решим попробовать решить задачу при помощи преобразования строки в символы и подсчета их суммы,
не зря же я проходил раздел преобразования и раздел работы со строками. Однако сразу моих знаний не хватило,
чтобы преобразовать числовой символ char в аналогичное число типа int. Пришлось изголяться...
 */
public class Task_4_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // инициализация сканера
        String str = scanner.nextLine(); // преобразование ввода в строку str
        int d = 0; // переменная
        char[] arr = str.toCharArray(); // конвертируем строку str в массив символов arr
        long[] mass = new long[str.length()]; // чтобы суммировать цифры, а не символы по кодировке ANSI
                                              // нужно перевести символы в цифры, для этого создаём новый масиив
                                              // c длиной строки str
        for (int i = 0; i < arr.length; i++) { // перебираем массив символов arr
            mass[i] = Character.getNumericValue(arr[i]); // преобразуем массив символов в массив цифр mass
        }
        for (int i = 0; i < mass.length; i++) { // перебираем массив цифр mass
            d += mass[i]; // складываем каждую цифру массива mass  и заносим в переменную d
        }
       System.out.println("Сумма цифр числа: " + str + " = " + d); // результат сложения выводим на консоль
    }
}
