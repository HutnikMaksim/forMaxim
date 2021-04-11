package hutnik.maksim.javaForJune;

import javax.swing.*;

class UsingWhileDemo {
    static int dekoder(String code){
        int n = code.length();
        int s = 0;
        int k = 1;
        int q = 1;
        int a;
        while (k <= n){
            if(code.charAt(n - k) == '1'){
                a = 1;
            }
            else {
                a = 0;
            }
            s += q * a;
            q *= 2;
            k++;
        }
        return s;
    }

    public static void main(String[] args) {
        String input;
        String title = "Расшифровка бинарого кода";
        input = JOptionPane.showInputDialog(null, "Введи бинарный код", title, 1);
        if (input == null){
            System.exit(0);
        }
        int number = dekoder(input);
        String text = "Введён бинарный код " + input;
        text += "\n Код соответствует числу " + number;
        JOptionPane.showMessageDialog(null, text, title, 2);
    }
}
