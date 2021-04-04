package hutnik.maksim.javaForJune;

public class UsingSwitchDemo {
    static String getDay(int num){
        String day;
        switch (num){
            case 1 -> day = "Понедельник";
            case 2 -> day = "Вторник";
            case 3 -> day = "Среда";
            case 4 -> day = "Четверг";
            case 5 -> day = "Пятница";
            case 6 -> day = "Суббота";
            case 7 -> day = "Воскресенье";
            default -> day = "ХЗ";
        }
        return day;
    }
    static String testDay(int num){
        String day;
        switch (num){
            case 1, 2, 3, 4, 5 -> day = "Будний день";
            case 6, 7 -> day = "Выходной день";
            default -> day = "ХЗ";
        }
        return day;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.println(i + ":" + getDay(i) + "\t - " + testDay(i));
        }
    }
}
