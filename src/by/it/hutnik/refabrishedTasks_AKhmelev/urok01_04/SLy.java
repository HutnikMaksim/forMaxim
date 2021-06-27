package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_04;

import java.util.Arrays;

class SLy {
    public static void mergeSort(int[] array, int left, int right) {
        // Выберем разделитель, т.е. разделим пополам входной массив
        int mid = left + ((right - left) / 2) + 1;
        // Выполним рекурсивно данную функцию для двух половинок (если сможем разбить)
        if (mid > 0 && right > (left + 1)) {
            mergeSort(array, left, mid - 1);
            mergeSort(array, mid, right);
        }
        // Создаём временный массив с нужным размером
        int[] buffer = new int[right - left + 1];
        // Начиная от указанной левой границы идём по каждому элементу
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            // Мы используем dim, чтобы указывать на элемент из правой части
            // Если dim > right, значит в правой части не осталось недобавленных элементов
            if (mid > right || array[cursor] > array[mid]) {
                buffer[i] = array[cursor];
                cursor++;
            } else {
                buffer[i] = array[mid];
                mid++;
            }
        }
        System.arraycopy(buffer, 0, array, left, buffer.length);
    }

    public static void main(String[] args) {
        int[] mass = {2,7,9,6,8,4,7,4,4,9};
        mergeSort(mass,0, mass.length - 1);
        System.out.println(Arrays.toString(mass));
    }
}
