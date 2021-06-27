package hutnik.maksim.javaForJune.Listing_11.Listing_11_2_MoreTryCatch;

import javax.swing.*;

class MoreTryCatchDemo {
    public static void main(String[] args) {
        String input;
        int size, index;
        char[] symbs;
        input = JOptionPane.showInputDialog(null,
                "Укажите размер массива",
                "Символьный массив",
                3);
        try{
            size = Integer.parseInt(input);
            symbs = new char[size];
            String txt = "| ";
            for(int i = 0; i < size; i++) {
                symbs[i] = (char) ('A' + i);
                txt += symbs[i] + " | ";
            }
            JOptionPane.showMessageDialog(null,
                    txt,
                    "Символы из массива",
                    1);
            input = JOptionPane.showInputDialog(null,
                    "Укажите индекс элемента",
                    "Индекс элемента массива",
                    3);
            index = Integer.parseInt(input);
            txt = "Интдекс - " + index + "\nСимвол - " + symbs[index];
            JOptionPane.showMessageDialog(null,
                    txt,
                    "Символ",
                    1);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,
                    "К сожалению возникла ошибка...",
                    "Ошибка",
                    2);
        } catch(NegativeArraySizeException e){
            JOptionPane.showMessageDialog(null,
                    "Некорректный размер массива!",
                    "Ошибка при создании массива",
                    0);
        } catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null,
                    "Вы уверены? Такого элемента нет!",
                    "Ошибка при выборе индекса",
                    0);
        }
    }
}
