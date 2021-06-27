package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_04;

import java.util.Scanner;

class Sorted {
    static void heapify(int[] array, int length, int i) { /* При первом поступлении аргументами передаются массив
                                                             array[], length=10, i=4 */
        int leftChild = 2*i+1; // 2*4=8+1=9
        int rightChild = 2*i+2; //2*4=8+2=10
        int largest = i; //4

        // если левый дочерний больше родительского
        if (leftChild < length && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        // если правый дочерний больше родительского
        if (rightChild < length && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        // если должна произойти замена
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array, length, largest);
        }
    }

    public static void heapSort(int[] array) { // На вход аргументом поступает массив array[]
        if (array.length == 0) return; // Если массив нулевой длины, то возврат

        // Строим кучу
        int length = array.length; // Присваиваем полю length значение длины массива array[] (например 10)
        // проходим от первого без ответвлений к корню
        for (int i = length / 2-1; i >= 0; i--) // Проходим от 10/2=5-1=4 до 0 и декремент на 1
            heapify(array, length, i); // Входим в метод heapify() с аргументами array[], length=10,i=4

        for (int i = length-1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }
    static void sortBuble(int[] array){
        int a = array.length - 1;
        int temp;
        while (a > 1){
            for (int i = 0; i < a; i++) {
                if(array[i] < array[i + 1]){
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = array[i];
                }
                a--;
            }
        }
    }

    public static void main(String[] args) {
        int[] massiv = {6, 1, 8, 3, 5, 2, 4};
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] mas = new int[n];
        long timeStart;
        long timeStop;

        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * n + 1);
            mas[i] = (int) (Math.random() * n + 1);
        }

        timeStart = System.currentTimeMillis();
        sortBuble(mas);
        timeStop = System.currentTimeMillis() - timeStart;
        System.out.println(timeStop);

        timeStart = System.currentTimeMillis();
        heapSort(arr);
        timeStop = System.currentTimeMillis() - timeStart;
        System.out.println(timeStop);
    }
}
