package by.it.hutnik.javazadachi_com;

import java.util.Scanner;

/*
2. В переменной n хранится натуральное двузначное число. Создайте программу,
вычисляющую и выводящую на экран сумму цифр числа n.
Решение
1. Переменной a  типа int присвоим значение в виде любого двузначного числа.
2. Теперь, чтобы складывать числа, составляющие заданное число, нам необходимо их получить.
3. Для этого предлагаю использовать деление заданного числа по модулю на 10, и последняя цифра
заданного числа попадет в остаток. Для того, чтобы получить 2 (3,4...) цифру с конца заданного
числа нам перед делением по модулю необходимо разделить заданно число на 10 (100,1000...);
4. Создаем и присваиваем 2 переменным b и c значения деления по модулю.
5. Выводим результат на экран.
 */
class Task_1_2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
        for (int i = 10; i < 100; i++) {
            int res = i / 10;
            int ostatok = (i % 10);
            int sum = res + ostatok;
            System.out.println("Сфумма цифр числа " + i + " : " + res + " + " + ostatok + " = " + sum);
        }
    }
}
