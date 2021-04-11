package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

import java.util.Date;

class Less_24_StringBuilder {
    public static void main(String[] args) {
        long timeStart1 = System.currentTimeMillis();
        String str1 = "Test ";
        String str2 = "Test ";
        for (int i = 0; i < 10000; i++) {
            str2 = str2 + str1;
        }
        System.out.println(str2);
        long timeFinish1 = System.currentTimeMillis() - timeStart1;
        System.out.println(timeFinish1);

        long timeStart2 = System.currentTimeMillis();
        StringBuilder strB = new StringBuilder("Fast");
        for (int i = 0; i < 10000; i++) {
            strB.append(" Fast");
        }
        System.out.println(strB.toString());
        long timeFinish2 = System.currentTimeMillis() - timeStart2;
        System.out.println(timeFinish2);
    }
}
