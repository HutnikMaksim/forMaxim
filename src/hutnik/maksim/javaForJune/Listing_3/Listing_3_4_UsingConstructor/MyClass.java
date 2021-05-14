package hutnik.maksim.javaForJune.Listing_3.Listing_3_4_UsingConstructor;

class MyClass {
    int number;
    char symbol;
    MyClass(){
        number = 100;
        symbol = 'A';
    }
    MyClass(int n, char s){
        number = n;
        symbol = s;
    }
    void show(){
        System.out.println("Значения полей " + number + " и " + symbol);
    }

}
