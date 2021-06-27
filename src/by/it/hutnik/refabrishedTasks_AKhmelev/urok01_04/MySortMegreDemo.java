package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_04;

import java.util.Arrays;

class MySortMegreDemo {
    public static void mergeSort(int[] array, int left, int right) {
        System.out.println("Первый = " + right);
        if (right <= left) return;
        /* 1-й проход left=0, right=9 */
        int mid = (left+right)/2;
        /* 1-й проход mid=4 / 2-й проход mid=2
           3-й проход mid=1 / 4-й проход mid=0 */
        System.out.println("Второй = " + right);
        mergeSort(array, left, mid);
        System.out.println("Третий = " + right); // Именно здесь происходит повышение right на 1 до 2
        /* 1-й проход left=0, mid=right=4 / 2-й проход left=0, mid=right=2
           3-й проход left=0, mid=right=1 / 4-й проход left=0, mid=right=0   */
        mergeSort(array, mid+1, right);
        System.out.println("Четвёртый = " + right); // А вот тут после выполнения метода megre не повышается (=4)
        merge(array, left, mid, right); /* 1-й проход left=0, mid=0, right=1 / 2-й проход left=0, mid=1, right=2(как???)
                                           3-й проход left=3, mid=3, right=4 / 4-й проход left=0, mid=2, right=4
                                           5-й проход left=5, mid=5, right=6 / 6-й проход left=5, mid=6, right=7
                                           7-й проход left=8, mid=8, right=9 / 8-й проход left=5, mid=7, right=9
                                           9-й проход left=0, mid=4, right=9 / 10-й проход left=0, mid=0, right=0*/
        System.out.println("Пятый = " + right);
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
        int[] array = {2,7,9,6,8,4,7,4,4,9};
        int left = 0;
        int rigth = array.length - 1;
        mergeSort(array,left, rigth);
        System.out.println(Arrays.toString(array));
    }
}
