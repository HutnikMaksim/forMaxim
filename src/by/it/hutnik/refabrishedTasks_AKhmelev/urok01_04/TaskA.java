package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_04;

/* A1. Создайте в пакете класс TaskA и напишите в нем метод
static void printMulTable() для вывода на консоль таблицы умножения в следующем виде (с
учетом пробелов):*/
/* A2. Напишите также метод static void buildOneDimArray(String line), который:
 формирует из строки line массив вещественных чисел,
(можно скопировать для этого класс InOut, написанный в jd01_03 Задание A)
 выводит в 5 колонок этот массив с названием V и индексами (тоже InOut),
например V[ 1 ]=12,234 V[ 2 ]=2,345 и т.д.
 сортирует этот массив по возрастанию (см. Helper.sort в jd01_03 Задание B)
 еще раз выводит его (см. InOut), но уже в 4 колонки с заголовками и тем же названием
 выполняет вычисление новых (после сортировки) индексов первого и последнего элемента
исходного массива и печатает их в виде:
Index of first element=2
Index of last element=7 */
/* A3. В основном методе public static void main(String[ ] args) класса TaskA
 вызовите printMulTable
 прочитайте с консоли строку из чисел, введенных через пробел (nextLine() в scanner-е)
 вызовите buildOneDimArray с этой строкой в качестве аргумента */

import java.util.Scanner;

class TaskA {
    static void printMulTable(){
        int digit = 2;
        int res;
        while (digit < 10){
            for (int i = 2; i < 10; i++) {
                res = digit * i;
                System.out.printf("%1d*%1d=%-3d", digit, i, res);
            }
            digit++;
            System.out.println();
        }
    }

    static void buildOneDimArray(String line){
        line = line.trim();
        int column = 0;
        double firstElement = 0;
        double lastElement = 0;
        int indexFirstElement = 0;
        int indexLastElement = 0;
        String[] elements = line.split(" ");
        double[] arr = new double[elements.length];
        for (int i = 0; i < elements.length; i++) {
            arr[i] = Double.parseDouble(elements[i]);
            System.out.print("V[" + i + "]=" + arr[i]);
            column++;
            if(column % 5 == 0){
                System.out.println();
            }

        }
        firstElement = arr[0];
        lastElement = arr[arr.length - 1];
        column = 0;
        System.out.println();
        int fin = arr.length - 1;
        double temp;
        while(fin > 1){
            for (int i = 0; i < fin; i++) {
                if(arr[i] > arr[i + 1]){
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            fin--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print("V[" + i + "]=" +  arr[i]);
            column++;
            if(column % 4 == 0){
                System.out.println();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == firstElement){
                indexFirstElement = i;
            }
            if(arr[i] == lastElement){
                indexLastElement = i;
            }
        }
        System.out.println();
        System.out.println("Index of first element=" + indexFirstElement);
        System.out.println("Index of last element=" + indexLastElement);


    }

    public static void main(String[] args) {
        printMulTable();
        //String line = " 71.3 36.1 14.6 66.6 57.1 33.3 30.4 10.9 11.17 ";
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        buildOneDimArray(text);

    }
}

