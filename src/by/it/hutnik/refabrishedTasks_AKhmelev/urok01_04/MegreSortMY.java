package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_04;

import java.util.Arrays;

class MegreSortMY {
    public static void mergeSort(int[] array, int left, int right) {
        if (right <= left) return; // Если длина массива меньше или равна 1 возврат
        int mid = (left+right)/2; /* Находим средину массива, причём если массив из нечётного колличества элементов,
                                     то середина будет ближе к началу массива Например: массив из 9 чисел,
                                     середина будет 4-й элемент, а не 5-й*/
        mergeSort(array, left, mid); /* Входим в рекурсию с аргументами mass[], left=0, right=mid=4
                                       и так до тех пор пока right > left*/
        mergeSort(array, mid+1, right);
        merge(array, left, mid, right);
    }
    static void merge(int[] array, int left, int mid, int right) {
        // вычисляем длину
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        // создаем временные подмассивы
        int leftArray[] = new int [lengthLeft];
        int rightArray[] = new int [lengthRight];

        // копируем отсортированные массивы во временные
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left+i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid+i+1];

        // итераторы содержат текущий индекс временного подмассива
        int leftIndex = 0;
        int rightIndex = 0;

        // копируем из leftArray и rightArray обратно в массив
        for (int i = left; i < right + 1; i++) {
            // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // если все элементы были скопированы из rightArray, скопировать остальные из leftArray
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // если все элементы были скопированы из leftArray, скопировать остальные из rightArray
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] mass = {2,7,9,6,8,4,7,4,4,9};
        mergeSort(mass,0, mass.length - 1);
        System.out.println(Arrays.toString(mass));
    }
}
