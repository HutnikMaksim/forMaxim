package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;
/* Создать переменную для массива из 10 элементов.
Заполнить его произвольными значениями целочисленного типа.
Определить сумму элементов массива, расположенных между минимальным и максимальным значениями.
Если значений минмимальных и максимальных несколько,
то необходимо взять максимальное значение разницы индексов между минимальным и максимальным значениями.
 */
public class Task21 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int minStart = 10;
        int minFinish = 10;
        int maxStart = 0;
        int maxFinish = 0;
        int indexMinStart = 0;
        int indexMaxStart = 0;
        int indexMinFinish = 0;
        int indexMaxFinish = 0;
        int resut = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
            if (minStart > arr[i]) {
                minStart = arr[i];
                indexMinStart = i;
            }
            if (maxStart < arr[i]) {
                maxStart = arr[i];
                indexMaxStart = i;
            }
            System.out.println("Индекс " + i + " = " + arr[i]);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (minFinish > arr[i]) {
                minFinish = arr[i];
                indexMinFinish = i;
            }
            if (maxFinish < arr[i]) {
                maxFinish = arr[i];
                indexMaxFinish = i;
            }
        }

        int tempSmall = Math.abs(indexMinFinish - indexMaxStart);
        int tempLarge = Math.abs(indexMinStart - indexMaxFinish);

        if (tempSmall < tempLarge) {
            if (indexMinStart < indexMaxFinish) {
                for (int i = indexMinStart + 1; i < indexMaxFinish; i++) {
                    resut += arr[i];
                }
            } else {
                for (int i = indexMinStart - 1; i > indexMaxFinish; i--) {
                    resut += arr[i];
                }
            }
        } else {
            if (indexMinFinish < indexMaxStart) {
                for (int i = indexMinFinish + 1; i < indexMaxStart; i++) {
                    resut += arr[i];
                }
            } else {
                for (int i = indexMinFinish - 1; i > indexMaxStart; i--) {
                    resut += arr[i];
                }
            }
        }

        if (tempSmall < tempLarge){
            System.out.println("Минимум = " + minStart + ", а его индекс = " + indexMinStart);
            System.out.println("Максимум = " + maxFinish + ", а его индекс = " + indexMaxFinish);
        } else {
            System.out.println("Минимум = " + minFinish + ", а его индекс = " + indexMinFinish);
            System.out.println("Максимум = " + maxStart + ", а его индекс = " + indexMaxStart);
        }
        System.out.println("Сумма элементов массива находящихся между минимальным и максимальным значением массива = " + resut);
    }
}