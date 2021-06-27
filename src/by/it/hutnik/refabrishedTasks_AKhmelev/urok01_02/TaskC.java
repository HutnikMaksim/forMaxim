package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_02;
/*
В классе TaskC один раз введите с консоли n через объект типа Scanner - размерность матрицы arr [n] [n] и вызовите из
метода main статические методы step1 step2 step3 с указанной сигнатурой:
1. Задать значения элементов матрицы в интервале значений от -n до n с
помощью генератора случайных чисел. Числа целые. Тип int.
Пока в матрице нет чисел n и -n генерацию следует повторять, иначе
вывести матрицу в консоль, а затем, вернуть полученную матрицу.
Сигнатура int[ ][ ] step1(int n).
2. Найти, вывести и вернуть сумму элементов исходной матрицы arr,
расположенных между первым и вторым положительными элементами
каждой строки. Сигнатура int step2(int[ ][ ] arr).
3. Найти максимальный элемент(ы) в матрице и удалить из исходной
матрицы все строки и столбцы, его содержащие. Вывести в консоль и
вернуть полученную матрицу. Сигнатура int[ ][ ] step3(int[ ][ ] arr).
При выводе результатов в консоль отделяйте элементы строк одиночными
пробелами, а сами строки - переносами \n
 */
import java.util.Scanner;

class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("Summa = " + step2(step3(step1(n))));
    }

    static int[][] step1(int n){
        boolean plus;
        boolean minus;
        int[][] arr = new int[n][n];
        do {
            plus = false;
            minus = false;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = (int) (Math.random() * (n * 2 + 1)) - n;
                    if (arr[i][j] == -n) minus = true;
                    if (arr[i][j] == n)  plus = true;
                }
            }
        } while (!plus  || !minus );

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4s", arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }

    static int step2(int[][] arr) {
        int min = 0;
        int max = 0;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    count++;
                    if (count == 1) {
                        min = j;
                    }
                    if (count == 2) {
                        max = j;
                        for (j = min + 1; j < max; j++) {
                            sum += arr[i][j];
                        }
                    }
                }
            }
            min = 0;
            max = 0;
            count = 0;
        }
        return sum;
    }

    static int[][] step3(int [][] arr){
        int maxValue = Integer.MIN_VALUE; // Присвоить минимальное значение полю maxValue
        boolean flag = false;

        int[] row = new int[arr.length]; // Создать одномерный массив row размером arr.length (5)
        int[] col = new int[arr[0].length]; // Создать одномерный массив col размером arr[0].length (5)

        int rowCount = 0; // Счётчики строк и столбцов после удаления максимальных значений в массиве
        int colCount = 0;


        for (int i = 0; i < arr.length; i++) { // Перебираем массив arr ...
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > maxValue){ // И если значение элемента в массиве больше maxValue...
                    maxValue = arr[i][j]; // Присваиваем maxValue значение элемента массива
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == maxValue){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < row.length; i++) {
            if(row[i] == 0){
                rowCount++;
            }
        }

        for (int j = 0; j < col.length; j++) {
            if(col[j] == 0){
                colCount++;
            }
        }

        int[][] arrEnd = new int[rowCount][colCount];
        int iR = 0;
        int jC = 0;
        int temp = 0;

        System.out.println("++++++++++++++");

        for (int i = 0; i < arr.length; i++) { // Перебираем массив arr ...
            for (int j = 0; j < arr[0].length; j++) {
                if(row[i] != 0){
                    iR--;
                    flag = true;
                    break;
                }
                if(col[j] == 0){
                    System.out.printf("%4s", arr[i][j]);
                    temp = arr[i][j];
                    arrEnd[iR][jC] = temp;
                    jC++;
                }
            }
            jC = 0;
            iR++;

            if(flag == false){
                System.out.println();
            }
            flag = false;

        }

        System.out.println("_______________________________");
        for (int k = 0; k < arrEnd.length; k++) {
            for (int l = 0; l < arrEnd[0].length; l++) {
                System.out.print(arrEnd[k][l] + "\t");
            }
            System.out.println();
        }
        System.out.println("________________________________");

        System.out.println();


       return arrEnd;
    }
}
