package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_04;

/* С1. Повторите полностью в этом классе задание A2 (скопируйте в TaskC готовый
метод static void buildOneDimArray(String line) и вызовите его из main, но
сортировку переделайте (т.е. замените) из пузырьковой в более быструю
сортировку слиянием с O-сложностью не выше, чем O(n log n).
Метод для сортировки должен находиться в классе TaskC и иметь сигнатуру:
static void mergeSort(double[ ] array)
Подсказки: удобно предусмотреть также наличие второй копии этого метода для
возможности рекурсивного вызова, например, с такой сигнатурой
private static void mergeSort(double[ ] array, int left, int right)
метод для слияния двух массивов разработайте самостоятельно, его сигнатура
может быть, например, вот такой
private static double[ ] merge(double[ ] part1, double[ ] part2)
С2. Также при повторе задания A2 выполните вычисление новых (после
сортировки) индексов первого и последнего элемента исходного массива с
помощью собственного алгоритма двоичного (бинарного) поиска, который
должен находиться в классе TaskC и иметь сигнатуру:
static int binarySearch(double[ ] array, double value) */

/*
static void heapify(int[] array, int length, int i) {
    int leftChild = 2*i+1;
    int rightChild = 2*i+2;
    int largest = i;

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

public static void heapSort(int[] array) {
    if (array.length == 0) return;

    // Строим кучу
    int length = array.length;
    // проходим от первого без ответвлений к корню
    for (int i = length / 2-1; i >= 0; i--)
        heapify(array, length, i);

    for (int i = length-1; i >= 0; i--) {
        int temp = array[0];
        array[0] = array[i];
        array[i] = temp;

        heapify(array, i, 0);
    }
}
 */

/*
public static void mergeSort(int[] source, int left, int right) {
        // Выберем разделитель, т.е. разделим пополам входной массив
        int delimiter = left + ((right - left) / 2) + 1;
        // Выполним рекурсивно данную функцию для двух половинок (если сможем разбить(
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(source, left, delimiter - 1);
            mergeSort(source, delimiter, right);
        }
        // Создаём временный массив с нужным размером
        int[] buffer = new int[right - left + 1];
        // Начиная от указанной левой границы идём по каждому элементу
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            // Мы используем delimeter чтобы указывать на элемент из правой части
            // Если delimeter > right, значит в правой части не осталось недобавленных элементов
            if (delimiter > right || source[cursor] > source[delimiter]) {
                buffer[i] = source[cursor];
                cursor++;
            } else {
                buffer[i] = source[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, source, left, buffer.length);
}

*/

class TaskC {
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
}
