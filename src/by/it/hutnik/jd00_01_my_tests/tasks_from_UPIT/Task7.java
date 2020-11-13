package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;

import java.util.Scanner;

/* Имеется прямоугольное отверстие размерами a и b, где a и b - целые числа. Определить,
можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число)
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt(); // вводим первую сторону прямоугольника
        int b = scanner.nextInt(); // вводим вторую сторону прямоугольника
        int r = scanner.nextInt(); // вводим радиус картонки
        boolean bool = false;
        double c = Math.sqrt(a * a + b * b);
        if (r >= c){
            System.out.println("Закрывает полностью");
        } else System.out.println("Не закрывает частично");
    }

}
