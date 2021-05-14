package hutnik.maksim.javaForJune.Listing_8.Listing_8_4_ObjectAsResult;

class ObjectAsResultDemo {
    static MyClass createObject(int n, String s){
        return new MyClass(n ,s); /* результатом метода createObject будет создание нового объекта класса
        MyClass с переданными ему аргументами (n ,s) из строки 10, где создаётся объектная переменная
        createObject(100, "alpha"), соответственно аргументами будут int 100 и String "alpha".
        Далее компилятор переходит в класс MyClass и передаёт аргументы конструктору MyClass(int n, String s) */
    }

    public static void main(String[] args) {
        MyClass objMyClass = createObject(100, "alpha"); /* Создаётся объектная переменная objMyClass
        которой присваивается значение результата метода createObject*/
        objMyClass.set(200).show(); /* Инструкция objMyClass.set(200) меняет значение только целочисленного поля
        code объекта objMyClass и методом show() выводит в консоль изменённое значение поля code (200) и "старое"
        значение поля name ("alpha") */
        objMyClass.set("bravo").show(); /* Инструкция objMyClass.set("bravo") меняет значение только текстового
        поля name объекта objMyClass и методом show() выводит в консоль "старое" значение поля code (200) и
        изменённое значение поля name ("bravo") */
        objMyClass.show(); /* Для проверки выполняется метод show() объекта objMyClass. В результате
        в консоли будет выведено значение поля code (200) и значение поля name ("bravo") */
        createObject(300, "charlie").set(400, "delta").show(); /* Инструкция createObject(300, "charlie")
        создаёт новый объект с переданными ему аргументами int 300 и String "charlie". Передаёт эти аргументы в
        конструктор MyClass(int n, String s) в котором они присваиваются полям code и name, а затем интрукцией
        show(), выводятся в консоль. Далее созданному объекту objMyClass инструкцией .set(400, "delta")
        передаются новые аргументы, которые меняют значения поля code на 400, а name на "delta", и командой
        на выполнение метода .show(), выводится в консоль!*/

    }
}
