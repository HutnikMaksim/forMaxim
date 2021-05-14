package hutnik.maksim.javaForJune.Listing_2;

import java.util.Scanner;

class Listing_2_5_InputVariableConsoleDemo {
    public static void main(String[] args) {
        String name;
        int age;
        double height;
        double weight;
        int year = 2021;
        double mass;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя и фамилию");
        name = scanner.nextLine();
        System.out.println("Введите Ваш возраст");
        age = scanner.nextInt();
        System.out.println("Введите Ваш рост");
        height = scanner.nextDouble();
        System.out.println("Введите Ваш вес");
        weight = scanner.nextDouble();
        mass = weight / (Math.pow(height, 2));
        mass = Math.round(mass * 100) / 100.0;
        System.out.println("Ваше имя: " + name);
        System.out.println("Ваш возраст: " + age + " лет");
        System.out.println("Ваш рост: " + height * 100 + " см");
        System.out.println("Масса тела: " + weight + " кг");
        System.out.println("Зравствуйте, " + name + "!");
        year = year - age;
        System.out.println("Вы родились в " + year + " году.");
        System.out.println("Ваш индекс массы тела = " + mass);
    }
}
