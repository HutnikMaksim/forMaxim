package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_03;

/* B. Реализуйте статические методы для поиска минимального и максимального значения в
одномерном массиве для типа double. Реализуйте статические методы для сортировки по
возрастанию одномерных массивов типа double. Разместите эти методы в классе Helper.
 Сигнатуры: static double findMin(double[ ] arr)
 static double findMax(double[ ] arr)
 static void sort(double[ ] arr) */

/* C. Реализуйте умножение матрицы на вектор, матрицы на матрицу для типа double. Разместите
статические методы в классе Helper.
 Сигнатуры: static double[ ] mul(double[ ][ ] matrix, double[ ] vector)
 static double[ ][ ] mul(double[ ][ ] matrixLeft, double[ ][ ] matrixRight)
 Реализуйте класс Runner в котором проверьте все разработанные
методы (проверьте ввод-вывод одномерных массивов, проверьте сортировку и поиск
минимума/максимума в одномерном массиве, операции матричного умножения).
 Добавьте JavaDoc к разработанным методам */

class Helper {
    static double findMin(double[ ] arr){
        double minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(minValue > arr[i]){
                minValue = arr[i];
            }
        }
        return minValue;
    }

    static double findMax(double[ ] arr){
        double maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    static void sort(double[ ] arr){
        double temp;
        int fin = arr.length - 1;
        while (fin > 1){
            for (int i = 0; i < fin; i++) {
                if(arr[i] > arr[i + 1]){
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
            fin--;
        }
    }

    static double[ ] mul(double[ ][ ] matrix, double[ ] vector){
        double[] x = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                x[i] = x[i] + matrix[i][j] * vector[j];
                System.out.printf("[%5.2f] ", x[i]);
            }
        }
        System.out.println();
        return x;
    }

    static double[ ][ ] mul(double[ ][ ] matrixLeft, double[ ][ ] matrixRight){
        double[][] z = new double[matrixLeft.length][matrixRight[0].length];
        int count = 0;
        for (int i = 0; i < matrixLeft.length; i++) {
            for (int j = 0; j < matrixRight[0].length; j++) {
                for (int k = 0; k < matrixRight.length; k++) {
                    z[i][j] += matrixLeft[i][k] * matrixRight[k][j];
                    System.out.printf("[%5.2f] ", z[i][j]);
                    count++;
                    if(count % (matrixLeft.length * matrixRight.length) == 0){
                        System.out.println();
                    }
                }
            }
        }
        return z;
    }
}
