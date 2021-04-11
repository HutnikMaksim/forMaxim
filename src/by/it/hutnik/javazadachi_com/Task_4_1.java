package by.it.hutnik.javazadachi_com;
/*
Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
 */
class Task_4_1 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i = i + 3) {
            System.out.print(i + " ");
            if((((i - 1000) % 60 == 0)) && (i != 1000)){
                System.out.println();
                System.out.print("     ");
            }
        }
    }
}
