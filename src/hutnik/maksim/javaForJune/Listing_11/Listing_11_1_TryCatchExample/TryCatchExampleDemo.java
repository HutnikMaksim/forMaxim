package hutnik.maksim.javaForJune.Listing_11.Listing_11_1_TryCatchExample;

import static javax.swing.JOptionPane.*;

class TryCatchExampleDemo {
    public static void main(String[] args) {
        String input;
        int num;
        input = showInputDialog(null, "Введите число", "Число", 3);
        try{
            num = Integer.parseInt(input);
            showMessageDialog(null,
                    "Числа " + (num - 1) + ", " + num + " и " + (num + 1),
                    "Числа",
                    1);
        } catch(Exception e){
            showMessageDialog(null,
                    "Что-то пошло не так...",
                    "Ошибка",
                    0);
        }
    }
}
