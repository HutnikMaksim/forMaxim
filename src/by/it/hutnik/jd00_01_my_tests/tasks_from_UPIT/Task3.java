package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;
/* Написать код, который выведет значения переменных на экран:
byte b = 0x55;
short s = 0x55ff;
int i = 1000000;
long l = 0xffffffffL;
char c = 'a';
float f = 25f;
double d = 00001234;
boolean bool = true;
 */
public class Task3 {
    public static void main(String[] args) {
        byte b = 0x55;
        short s = 0x55ff;
        int i = 1000000;
        long l = 0xffffffffL;
        char c = 'a';
        float f = 25f;
        double d = 00001234;
        boolean bool = true;
        System.out.println(b + " " + s + " " + i + " " + l + " " + c + " " + f + " " + d + " " + bool);
        System.out.println("byte \"0x55\" = " + b);
        System.out.println("short \"0x55ff\" = " + s);
        System.out.println("int \"1000000\" = " + i);
        System.out.println("long \"0xffffffffL\" = " + l);
        System.out.println("char \"a\" = " + c);
        System.out.println("float \"25f\" = " + f);
        System.out.println("double \"00001234\" = " + d);
        System.out.println("boolean \"true\" = " + bool);
    }
}
