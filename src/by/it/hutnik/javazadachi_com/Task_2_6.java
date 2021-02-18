package by.it.hutnik.javazadachi_com;
/*
6. В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе на экран
последовательность a, b и c оказалась строго возрастающей.
 */
public class Task_2_6 {
    public static void main(String[] args) {
        int a = 34;
        int b = 21;
        int c = 18;
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        if(a < b){
            temp1 = a;
            temp2 = b;
        } else {
            temp1 = b;
            temp2 = a;
        }
        if(temp2 < c){
            temp3 = c;
        } else if(temp1 > c){
            temp3 = temp2;
            temp2 = temp1;
            temp1 = c;
        } else {
            temp3 = temp2;
            temp2 = c;
        }
        System.out.println(temp1 + " " + temp2 + " " + temp3);

    }
}
