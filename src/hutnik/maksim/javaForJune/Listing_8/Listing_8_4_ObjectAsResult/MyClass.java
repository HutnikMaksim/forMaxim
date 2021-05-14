package hutnik.maksim.javaForJune.Listing_8.Listing_8_4_ObjectAsResult;

class MyClass {
    private int code;
    private String name;
    MyClass(int n, String s){ /* Сюда попадают аргументы int 100 и String "alpha" */
        System.out.println("Создание объекта:");
        set(n, s).show(); /* Вызывается метод set(n, s) с двумя переменными и в качестве аргументов
        ему передаются всё те же int 100 и String "alpha" */
    }
    MyClass set(int n){
        code = n;
        return this; /* Результатом возвращается объект objMyClass из которого вызван метод MyClass set(int n)
        при этом полю code данного метода присваивается значение n*/
    }
    MyClass set(String s){
        name = s;
        return this; /* Результатом возвращается объект objMyClass из которого вызван метод MyClass set(String s)
        при этом полю name данного метода присваивается значение s*/
    }
    MyClass set(int n, String s){ /* Методу set(n, s) передаются аргументами int 100 и String "alpha" */
        return set(n).set(s); /* Возвращает результат метода MyClass set(String s) из объекта, который
         возвращается при вызове метода MyClass set(int n) */
    }
    void show(){
        System.out.println("Поле code = " + code);
        System.out.println("Поле name = " + name);
        System.out.println("____________________");

    }

}
