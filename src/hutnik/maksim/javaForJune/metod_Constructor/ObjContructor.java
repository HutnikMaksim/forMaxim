package hutnik.maksim.javaForJune.metod_Constructor;

public class ObjContructor {
    int number;
    char symbol;
    ObjContructor(){
        number = 100;
        symbol = 'A';
    }
    ObjContructor(int n, char s){
        number = n;
        symbol = s;
    }
    void show(){
        System.out.println("Значения полей " + number + " и " + symbol);
    }

}
