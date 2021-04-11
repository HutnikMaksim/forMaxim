package hutnik.maksim.javaForJune.extendingJOptionPane;

import javax.swing.*;

class MyPane extends JOptionPane {
    static void showMessage(String txt, String title){ /* "Пустой" метод которому подаются 2 строковых аргумента
                                                          txt и title. */
        showMessageDialog(null,
                                        txt,
                                        title,
                            -1,
                                        new ImageIcon("d:/M.png")); /* На выходе получаем диалоговое окно с
                                        входными аргументами txt и title, а также тип иконки диалогового окна (в данном
                                        случае "без иконки", и добавляем собственную иконку инициализировав её командой
                                        new ImageIcon() */
    }
    static void showMessage(String txt){ /* "Пустой" метод которому подаётся 1 строковый аргумент */
        showMessage(txt, "Сообщение"); /* На выходе получаем диалоговое окно как в вышеуказанном методе, т.к.
                                              по сути этот метод - ссылка на первый метод, но с 2 изменениями
                                              txt = той строковой переменной, что подана в этот метод в качестве
                                              аргумента, а title = "Сообщение" */
    }
    static int getInteger(String txt){ /* Не "пустой" метод, аргументом которому подаётся строковая переменная txt */
        String res; // Объявление строковой переменной res
        res = showInputDialog(null,
                                txt,
                            "Число (по умолчанию 10)",
                     3); /* Получаем диалоговое окно ввода с сообщением поданного в метод аргумента txt */
        if(res == null){ // Проверяем введено ли число
            return 10; // и если не введено, то метод возвращает число 10
        }
        else{
            return Integer.parseInt(res); // если введено, то переводит строковое выражение введённого числа в число
        }
    }
}
