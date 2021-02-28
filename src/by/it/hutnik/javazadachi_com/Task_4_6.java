package by.it.hutnik.javazadachi_com;
/*
Выведите на экран все двузначные члены последовательности 2an-1+200, где a1= –166.
 */
public class Task_4_6 {
    public static void main(String[] args) {
        for (int i = -166; i < 100; i = 2 * i + 200) {
            if((i > -100) && (i < - 9 || i > 9)){
                System.out.print(i + " ");
            }
        }
    }
}
