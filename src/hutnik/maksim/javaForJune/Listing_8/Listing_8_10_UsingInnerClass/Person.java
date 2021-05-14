package hutnik.maksim.javaForJune.Listing_8.Listing_8_10_UsingInnerClass;

class Person {
    String name;
    double money;
    double rate; // Проверить!!!
    int time;
    double getMoney(){
        double s =money;
        for (int i = 1; i <= time; i++) {
            s *= (1 + rate / 100);
        }
        s = Math.round(s * 100) / 100.0;
        return s;
    }
    public String toString(){
        String txt = "Имя: " + name + "\n";
        txt += "Начальная сумма: " + money + "\n";
        txt += "Поцентная ставка: " + rate + "\n";
        txt += "Время (лет): " + time + "\n";
        txt += "Итоговая сумма: " + getMoney();
        return txt;
    }
    Person(String txt, double m, int t){
        name = txt;
        money = m;
        time = t;
    }
}
