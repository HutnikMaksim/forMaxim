package hutnik.maksim.javaForJune.Listing_8.Listing_8_8_ArraysOfObjects;

class MyClass {
    private int number; // Закрытое целочисленное поле
    MyClass(int n){ // Конструктор для передачи значения полю number
        number = n;
    }
    int get(){ // Метод который возвращает целочисленное поле number
        return number;
    }
}
