package hutnik.maksim.javaForJune.extendingJOptionPane;

class ExtendingJOP {
    public static void main(String[] args) {
        MyPane.showMessage("Всем привет!"); /* Заходим в метод MyPane.showMessage и передаём ему в качестве аргумента
                                                  строковое значение "Всем привет!" */
        int number; // объявление целочисленной переменной number
        number = MyPane.getInteger("Введи целое число"); /* придаём переменной number значение полученное
                                                               из диалогового окна ввода числа MyPane.getInteger
                                                               при этом меняя сообщение окна на строковое значение
                                                               "Введи целое число" */
        String txt = "Числа от 1 до " + number + ":\n"; // объявляем и инициализируем строковую переменную txt
        for (int i = 1; i <= number; i++) { // пробегаем цикл от 1 до введённого числа number
            txt += i + " "; // присваиваем строковой переменной txt значение цикла через пробел
        }
        MyPane.showMessage(txt, "Целые числа"); // Подаёт в метод MyPane.showMessage 2 строковых аргумента txt и title
    }
}
