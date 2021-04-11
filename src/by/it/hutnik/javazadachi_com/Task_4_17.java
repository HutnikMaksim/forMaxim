package by.it.hutnik.javazadachi_com;
/*
Электронные часы показывают время в формате от 00:00 до 23:59.
Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
что справа от двоеточия (например, 02:20, 11:11 или 15:51).

 */
class Task_4_17 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 24; i++) { // перебор часов
            for (int j = 0; j < 60; j++) { // перебор минут
                StringBuilder strI = new StringBuilder(); // создаём строку StringBuilder
                                                          // (её можно переворачивать, но нельзя сравнивать по equals)
                String strJ;
                String s1;
                String s2;

                if(i < 10){
                    strI = new StringBuilder("0" + i); // добавляем 0 перед цифров часов, если меньше 10
                } else{
                    strI = new StringBuilder("" + i);
                }
                s1 = new String(strI); // переводим в обычную строку часы с нулём впереди (для печати)
                strI.reverse(); // реверсируем часы для сравнения с минутами
                s2 = new String(strI); // переводим в обычную строку часы после реверса (для сравнения по equals)

                if(j < 10){
                    strJ = "0" + j; // добавляем нули впереди минут, если меньше 10
                } else{
                    strJ = "" + j;
                }
                if(s2.equals(strJ)){ // сравниваем по equals две обычных строки
                    System.out.print(s1 + ":");
                    System.out.println(strJ);
                    count ++; // считаем сколько раз совпало
                }
            }
        }
        System.out.println("В сутках " + count + " симметричных комбинаций");
    }
}
