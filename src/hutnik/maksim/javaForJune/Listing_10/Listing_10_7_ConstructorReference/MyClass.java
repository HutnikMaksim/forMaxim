package hutnik.maksim.javaForJune.Listing_10.Listing_10_7_ConstructorReference;

class MyClass {
    private int numer; // Закрытое целочисленное поле number
    // Конструктор MyClass() для передачи значения полю number аргументом n при создании объекта класса
    MyClass(int n){
        numer = n;
    }
    // Метод show() для отображения значения поля number
    void show(){
        System.out.println("Значение поля: " + numer);
    }
    // Метод set() для присваивания значения закрытому полю number
    void set(int n){
        numer = n;
    }
}
