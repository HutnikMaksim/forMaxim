package hutnik.maksim.javaForJune.Listing_9.Listing_9_6_GenTypeExtending;

class MyClass <X extends Base>{ /* Инструкция <X extends Base> означает, что значением обобщённого параметра
                                   типа Х при создании объекта класса MyClass может быть лишь класс, который
                                   является прямым или опосредованным (через несколько классов) наследником
                                   класса Base. В данном примере класс Alpha является прямым наследником класса Base,
                                   а класс Bravo - опосредованным (так как является прямым наследником класса Alpha,
                                   который является прямым для Base*/
    X obj; // Объявлено поле obj обобщённого типа Х
    MyClass(X obj){ // Передача аргумента полю obj типа Х с помощью конструктора MyClass()
        this.obj = obj;
    }
    void show(){
        System.out.println("Объект класса MyClass");
        obj.show();
    }
}
