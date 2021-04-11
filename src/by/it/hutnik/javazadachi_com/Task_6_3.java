package by.it.hutnik.javazadachi_com;
/*
Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
 */
class Task_6_3 {
    public static void main(String[] args) {
        int[] mass = new int[15];
        int count = 0;
        for (int i = 0; i < 15; i++) {
            mass[i] = (int)(Math.random() * 9);
            if(mass[i] % 2 == 0 && mass[i] != 0){
                count++;
            }
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        System.out.println("В массиве " + count + " чётных элементов");

    }
}
