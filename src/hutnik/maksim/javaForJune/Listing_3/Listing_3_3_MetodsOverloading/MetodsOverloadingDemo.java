package hutnik.maksim.javaForJune.Listing_3.Listing_3_3_MetodsOverloading;

class MetodsOverloadingDemo {
    public static void main(String[] args) {
        MyClass objMyClass1 = new MyClass(); // Создание 1 объекта класса MyClass
        MyClass objMyClass2 = new MyClass(); // Создание 2 объекта класса MyClass
        objMyClass1.set(100); // Передача аргумента типа int методу set(int n) класса MyClass
        objMyClass1.set('A'); // Передача аргумента типа char методу set(char s) класса MyClass
        System.out.println("Объект: objMyClass1"); // Печать строки "Объект: objMyClass1"
        objMyClass1.show(); /* Вызов метода void show() класса MyClass 1-го объекта objMyClass1, в который ранее
                               переданы аргументы objMyClass1.set(100) и objMyClass1.set('A')*/
        objMyClass2.set(); /* Вызов метода void set() класса MyClass 2-го объекта objMyClass2, в котором
                              уже есть аргументы int 0 и char Z*/
        objMyClass2.show("Объект: objMyClass2"); /* Вызов метода void show(String text) с одним текстовым
                                                        аргументом text класса MyClass 2-го объекта objMyClass2,
                                                        который выводит на экран строку с переданным текстом
                                                        "Объект: objMyClass2", добавляет текст из самого метода
                                                        " значения полей " и подставляет аргументы int 0 и char Z,
                                                        ранее переданные вызовом предыдущей команды
                                                        objMyClass2.set();*/
        objMyClass2.set(200, 'B'); /* Передача новых аргументов int 200 и char 'B' в метод void set(int n, char s)
                                      второго объекта objMyClass2 класса MyClass*/
        System.out.println("Объект: objMyClass2 после измнения:"); // Печать строки "Объект: objMyClass2 после измнения:"
        objMyClass2.show("Число", "Символ");/* Вызов метода void show(String txt1, String txt2) с двумя
                                               текстовыми аргументами txt1 и txt2 класса MyClass 2-го объекта
                                               objMyClass2, который выводит на экран 2 строки.
                                               Первую с переданным текстом "Число", добавляет двоеточие ": "
                                               и int поле number, ранее переданное аргументом 200 в метод set.
                                               Вторую строку с переданным текстом "Символ", добавляет
                                               двоеточие ": " и char поле symbol, ранее переданное в метод set
                                               аргументом 'B'.*/
    }
}
