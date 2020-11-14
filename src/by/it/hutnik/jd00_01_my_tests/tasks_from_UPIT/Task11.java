package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;

import java.util.Scanner;

/* Написать метод, который выводит расписание на недалею.
Задать на вход в метод порядковый номер дня недели и отобразить на экране то, что запланировано на этот день.
 */
public class Task11 {
    static void monday (){
        System.out.println("5:00 Подъём в понедельник");
        System.out.println("5:30 Утренняя зарядка");
        System.out.println("6:30 Завтрак");
        System.out.println("7:30 Развод");
        System.out.println("8:00 Начало рабочего дня");
        System.out.println("14:00 Обед");
        System.out.println("15:00 Прогулка по городу");
        System.out.println("18:00 Ужин");
        System.out.println("19:00 Просмотр телевизора");
        System.out.println("21:00 Отбой");
    }
    static void tuesday (){
        System.out.println("5:00 Подъём во вторник");
        System.out.println("5:30 Утренняя зарядка");
        System.out.println("6:30 Завтрак");
        System.out.println("8:00 Начало рабочего дня");
        System.out.println("14:00 Обед");
        System.out.println("15:00 Шоппинг");
        System.out.println("18:00 Ужин");
        System.out.println("19:00 Просмотр видео на Youtube");
        System.out.println("21:00 Отбой");
    }
    static void wednesday (){
        System.out.println("5:00 Подъём в среду");
        System.out.println("5:30 Утренняя зарядка");
        System.out.println("6:30 Завтрак");
        System.out.println("8:00 Начало рабочего дня");
        System.out.println("14:00 Обед");
        System.out.println("15:00 Посещение театра");
        System.out.println("18:00 Ужин");
        System.out.println("19:00 Чтение прессы");
        System.out.println("21:00 Отбой");
    }
    static void thursday (){
        System.out.println("5:00 Подъём в четверг");
        System.out.println("5:30 Утренняя зарядка");
        System.out.println("6:30 Завтрак");
        System.out.println("8:00 Начало рабочего дня");
        System.out.println("14:00 Обед");
        System.out.println("15:00 Посещение музеев");
        System.out.println("18:00 Ужин");
        System.out.println("19:00 Игры с детьми");
        System.out.println("21:00 Отбой");
    }
    static void friday (){
        System.out.println("5:00 Подъём в пятницу");
        System.out.println("5:30 Утренняя зарядка");
        System.out.println("6:30 Завтрак");
        System.out.println("8:00 Начало рабочего дня");
        System.out.println("14:00 Обед");
        System.out.println("15:00 Посещение бара");
        System.out.println("19:00 Дискотека");
        System.out.println("23:00 Отбой");
    }
    static void satuday (){
        System.out.println("8:00 Подъём в субботу");
        System.out.println("8:30 Утренняя зарядка");
        System.out.println("9:30 Завтрак");
        System.out.println("10:00 Наведение порядка в доме");
        System.out.println("14:00 Обед");
        System.out.println("15:00 Вечерний променад");
        System.out.println("18:00 Ужин");
        System.out.println("19:00 Изучение звёзд в телескоп");
        System.out.println("23:00 Отбой");
    }
    static void sunday (){
        System.out.println("8:00 Подъём в воскресенье");
        System.out.println("8:30 Утренняя зарядка");
        System.out.println("9:30 Завтрак");
        System.out.println("10:00 Прогулка с детьми в парке");
        System.out.println("14:00 Обед");
        System.out.println("15:00 Велосипедная прогулка");
        System.out.println("18:00 Ужин");
        System.out.println("19:00 Сбор на работу");
        System.out.println("21:00 Отбой");
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();
        if (dayOfWeek == 1) {
            monday();
        } else
            if (dayOfWeek == 2) {
                tuesday();
            } else
                if(dayOfWeek == 3) {
                    wednesday();
                } else
                    if (dayOfWeek == 4) {
                        thursday();
                    } else
                        if (dayOfWeek == 5) {
                            friday();
                        } else
                            if (dayOfWeek == 6) {
                                satuday();
                            } else
                                if (dayOfWeek == 7) {
                                    sunday();
                                } else System.out.println("Нет такого дня недели!");
    }
}
