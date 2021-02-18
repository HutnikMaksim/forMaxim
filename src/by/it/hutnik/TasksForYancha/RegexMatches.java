package by.it.hutnik.TasksForYancha;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    public static void main(String[] args) {
        String str = "Крещение Руси произошло в 987 году. Или может всё-таки в 9876?";
        String pattern = "(.*)(\\d+)(.*)";
        Pattern r = Pattern.compile(pattern);
        //Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        if (m.find()){
            System.out.println("Find value: " + m.group(0));
            System.out.println("Find value: " + m.group(1));
            System.out.println("Find value: " + m.group(2));
            System.out.println("Find value: " + m.group(3));
        } else {
            System.out.println("Does not match");
        }
    }
}
