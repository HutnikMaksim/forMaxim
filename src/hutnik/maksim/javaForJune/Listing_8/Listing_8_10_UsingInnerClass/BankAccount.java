package hutnik.maksim.javaForJune.Listing_8.Listing_8_10_UsingInnerClass;
import static javax.swing.JOptionPane.*;
class BankAccount {
    double rate;
    Person fellow;

    BankAccount(String name, double money, int time, double rate) { /* Сюда передаются в качестве аргументов
    данные из интсрукции создания нового объекта класса BankAccount из главного класса UsingInnerClassDemo (строка 5)*/
        this.rate = rate; /* аргумент rate передаётся полю rate класса BankAccount (поэтому его надо
        проинициализировать инструкцией this.rate = rate */
        fellow = new Person(name, money, time); /* Остальные аргументы передаются полям описанным во внутреннем классе
        Person, поэтому они в качестве аргументов передаются дальше в конструктор Person(String txt, double m, int t)
        внутреннего класса Person, при создании объека fellow класса Person */
    }

    void show() {
        showMessageDialog(null, fellow, "Депозит", 1);
    }

    class Person {
        String name;
        double money;
        int time;

        double getMoney() {
            double s = money;
            for (int i = 1; i <= time; i++) {
                s *= (1 + rate / 100);
            }
            s = Math.round(s * 100) / 100.0;
            return s;
        }

        public String toString() {
            String txt = "Имя: " + name + "\n";
            txt += "Начальная сумма: " + money + "\n";
            txt += "Процентная ставка: " + rate + "\n";
            txt += "Время (лет): " + time + "\n";
            txt += "Итоговая сумма: " + getMoney();
            return txt;
        }

        Person(String txt, double m, int t) { // Конструктор принимающий аргументами поля из
            name = txt;
            money = m;
            time = t;
        }
    }
}