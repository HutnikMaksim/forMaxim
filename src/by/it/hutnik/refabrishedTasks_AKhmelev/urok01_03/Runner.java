package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_03;


import java.util.Arrays;

class Runner {
    public static void main(String[] args) {
        String line = "71.3 36.1 14.6 66.6 57.1 33.3 30.4 10.9 11.17 ";
        double[][] matrixLeft = new double[][]{{1.3, 2.4, 3.5,},{1.4, 2.5, 3.6},{1.5, 2.6, 3.8}};
        double[][] matrixRight = new double[][]{{1.2, 2.3, 3.4},{1.3, 2.5, 3.6}, {1.4, 2.6, 3.7}};
        double[] vectorStat = new double[]{1.2, 1.3, 1.4};
        double[] mass = InOut.getArray(line);
        InOut.printArray(mass);
        InOut.printArray(mass, "v", 4);
        System.out.println("Максимальное значение массива = " + Helper.findMax(mass));
        System.out.println("Минимальное значение массива = " + Helper.findMin(mass));
        Helper.sort(mass);
        System.out.println("Отсортированный массив: ");
        InOut.printArray(mass);
        System.out.println("Исходная матрица: ");
        System.out.println(Arrays.deepToString(matrixLeft));
        System.out.println("Исходный вектор: ");
        System.out.println(Arrays.toString(vectorStat));
        System.out.println("Произведение матрицы на вектор:");
        Helper.mul(matrixLeft, vectorStat);
        System.out.println("Произведение матрицы на матрицу:");
        Helper.mul(matrixLeft, matrixRight);
    }

}
