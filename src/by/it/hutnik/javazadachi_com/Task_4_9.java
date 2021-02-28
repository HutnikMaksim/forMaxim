package by.it.hutnik.javazadachi_com;

import java.util.Scanner;

/*
Проверьте, является ли введённое пользователем с клавиатуры натуральное число — простым.
Постарайтесь не выполнять лишних действий (например, после того, как вы нашли хотя бы 1 нетривиальный делитель уже ясно,
что число составное и проверку продолжать не нужно). Также учтите, что наименьший делитель натурального числа n,
если он вообще имеется, обязательно располагается в отрезке [2; √n].
 */
public class Task_4_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int n = scanner.nextInt();
            boolean flag = true;
            if(n < 0){
                System.out.print("Число отрицательное");
                System.exit(0);//завршение работы программы
            }
            for (int i = 1; i <= (int) (Math.sqrt(n)); i++) {
                int res = n % (i + 1);
                if(n > 2 && res == 0){
                    System.out.println("Число не является простым!");
                    flag = false;
                    break;
                }
            }
            if(flag && n > 0) System.out.println("Число простое!");
        } else System.out.println("Введены неверные данные!");
    }
}
