package hutnik.maksim.javaForJune;

import java.util.Scanner;

class ReadLine {
    public static void main(String[] args) {
//        int year, age, birth;
//        String result;
//        result = JOptionPane.showInputDialog(null, "Какой сейчас год?");
//        year = Integer.parseInt(result);
//        result = JOptionPane.showInputDialog(null, "Сколько Вам лет исполнится в этом году?");
//        age = Integer.parseInt(result);
//        birth = year - age;
//        JOptionPane.showMessageDialog(null, "Вы родились в " + birth + " году");

        double m, h, bmi;
        int age, year, birth, now = 2021;
        String name, text;
//        text = JOptionPane.showInputDialog(null, "Ваш вес в килограммах?");
//        m = Double.parseDouble(text);
//        text = JOptionPane.showInputDialog(null, "Ваш рост в метрах?");
//        h = Double.parseDouble(text);
//        bmi = m / (Math.pow(h, 2));
//        bmi = (Math.round(bmi * 100)) / 100.0;
//        JOptionPane.showMessageDialog(null, "Ваш индекс массы тела составляет: " + bmi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Ваше имя и фамилию: ");
        name = scanner.nextLine();
        System.out.print("Введите Ваш возраст: ");
        age = scanner.nextInt();
        System.out.print("Введите Ваш рост: ");
        h = scanner.nextDouble();
        System.out.print("Введите Ваш вес: ");
        m = scanner.nextDouble();
        bmi = m / (Math.pow(h / 100, 2));
        bmi = (Math.round(bmi * 100) / 100.0);
        System.out.println();
        System.out.println("Вас зовут: " + name + "\n" + "Вы родились в " +  (now - age) + " году" + "\n" + "Ваш индекс массы составляет: " + bmi);
    }

}
