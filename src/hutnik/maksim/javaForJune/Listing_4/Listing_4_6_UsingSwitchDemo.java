package hutnik.maksim.javaForJune.Listing_4;

class Listing_4_6_UsingSwitchDemo {
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
            case 1, 2, 3, 4, 5 -> day = "будний день";
            case 6, 7 -> day = "выходной день";
            default -> day = "ХЗ";
        }
        return day;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 8; i++) {
            System.out.println(i + ":" + getDay(i) + "\t - " + testDay(i));
        }
    }

}
