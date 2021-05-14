package hutnik.maksim.javaForJune.Listing_3.Listing_3_3_MetodsOverloading;

class MyClass {
    int number;
    char symbol;
    void set(int n){ // Метод set класса MyClass принимающий аргумент типа int
        number = n;
    }
    void set(char s){ // Метод set класса MyClass принимающий аргумент типа char
        symbol = s;
    }
    void set(int n, char s){ // Метод set класса MyClass принимающий 2 аргумента типа int и типа char
        set(n);
        set(s);
    }
    void set(){ // Метод set класса MyClass по умолчанию, возвращающий 2 аргумента 0 и Z
        set(0, 'Z');
    }
    void show(){ /* Метод show класса MyClass по умолчанию, возвращающий строку "Значение полей" и
                    2 аргумента number и symbol переданных из главного класса */
        System.out.println("Значения полей: "+ number + " и " + symbol);
    }
    void show(String text){ /* Метод show класса MyClass принимающий текст text, возвращающий этот текст, строку
                               "значение полей" и 2 аргумента number и symbol переданных из главного класса */
        System.out.println(text + " значения полей " + number + " и " + symbol);
    }
    void show(String txt1, String txt2){
        System.out.println(txt1 + ": " + number);
        System.out.println(txt2 + ": " + symbol);
    }
}
