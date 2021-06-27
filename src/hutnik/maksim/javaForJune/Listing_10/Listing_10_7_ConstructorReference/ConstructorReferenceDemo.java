package hutnik.maksim.javaForJune.Listing_10.Listing_10_7_ConstructorReference;

class ConstructorReferenceDemo {
    public static void main(String[] args) {
        /* Переменной ref интерфейсного типа функционального интерфейса MyInterface значением
        присваивается ссылка MyClass::new на конструктор MyClass() класса MyClass */
        MyInterface ref = MyClass::new;
        /* Командой ref.create(100) создаётся объект класса MyClass со значением поля number = 100,
        *  а ссылка на этот объект записывается в объектную переменную obj класса MyClass */
        MyClass obj = ref.create(100);
        /* Теперь через объектную переменную obj можно обращаться к объекту класса MyClass так,
        *  как если бы он был создан с помощью выражения new MyClass(100) */
        obj.show();
        obj.set(200);
        obj.show();
    }
}
