package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_04;

class MegreSortYouTube {
    public static void main(String[] args) {
        int[] array = {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        System.out.println(arrayToString(array));
        // Вывод в консоль исходного массива
        array = mergeSort(array);
        // Передача исходного массива аргументом в метод megreSort()
        //System.out.println(arrayToString(array));
    }

    public static int[] mergeSort(int[] array) {
        int[] tmp;
        // Объявление временного массива неизвестной длины
        int[] currentSrc = array;
        // Массив источник (исходный массив)
        int[] currentDest = new int[array.length];
        // Массив приёмник длиной равной массиву источнику

        int size = 1;
        // Текущий размер слияемых массивов (начинается со слияния массивов длиной в 1 элемент)
        while (size < array.length) {
            // Пока текущий размер меньше длины исходного массива...

            for (int i = 0; i < array.length; i += 2 * size) {
                /* Перебираем массив array с шагом итерации равным i += 2 * size (= i = i + 2 * size) (сначала
               массивы по 1 элементу, слияем в массивы по 2 элемента, потом уже массивы по 2 элемента
               слияем в массивы по 4 элемента и т.д. до тех пор пока размер size меньше длины исходного размера */

                merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
                /* Передаём в метод merge() аргументы currentSrc - исходный массив array, i - номер его первого элемента,
                 *  currentSrc - снова исходный массив array, i + size - номер его элемента, увеличенный на значение size,
                 *  currentDest - массив приёмник, куда будут добавляться элементы из массивов источников, i - номер
                 *  первого элемента массива приёмника, size - длина текущего исходного массива */
            }

            tmp = currentSrc;
            // временному массиву прсваиваем значения текущего исходного массива
            currentSrc = currentDest;
            // текущему исходному массиву присваиваем значения массива приёмника
            currentDest = tmp;
            // массиву приёмнику присваиваем значения временного массива

            size = size * 2;
            // увеличиваем размер исходных текущих массивов в 2 раза

            System.out.println(arrayToString(currentSrc));
            /* Вывод на печать текущего положения элементов массива, после каждого прохода цикла for() */
        }
        return currentSrc;
        // Возвращаем текущий массив
    }

    private static void merge(int[] src1, int src1Start, int[] src2, int src2Start, int[] dest,
                              int destStart, int size) {
        int index1 = src1Start;
        // Объявляем переменную index1 равную номеру 1-го элемета 1-го исходного массива источника
        int index2 = src2Start;
        // Объявляем переменную index2 равную номеру 1-го элемета 2-го исходного массива источника

        int src1End = Math.min(src1Start + size, src1.length);
        // Находим номер элемента конца 1-го подмассива исходника
        int src2End = Math.min(src2Start + size, src2.length);
        // Находим номер элемента конца 2-го подмассива исходника

        int iterationCount = src1End - src1Start + src2End - src2Start;
        /* Вычисляем количество необходимых итераций (по сути количество элементов в 2-х слияемых массивах) */

        for (int i = destStart; i < destStart + iterationCount; i++) {
            /* Заполняем массив приёмник от i-го номера до i-го + количество элементов в слияемых массивах */


            if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])) {
                /* Если индекс элемента 1-го массива меньше значения индекса конца 1-го массива (не выходит за его пределы) И
                 *  И (значение индекса элемента 2-го массива больше или равен индексу элемента конца 2-го массива (равен
                 *  или больше длине 2-го массива, т.е. вышел за пределы массива) ИЛИ значение элемента 1-го массива меньше
                 *  значения элемента 2-го массива) */
                dest[i] = src1[index1];
                // Присваиваем i-му индексу значение элемента с 1-го массива
                index1++;
                // И увеличиваем значение индекса на единицу
            } else {
                dest[i] = src2[index2];
                index2++;
            }
        }
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
