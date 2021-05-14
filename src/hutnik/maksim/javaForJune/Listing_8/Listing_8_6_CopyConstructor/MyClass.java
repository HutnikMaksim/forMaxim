package hutnik.maksim.javaForJune.Listing_8.Listing_8_6_CopyConstructor;

class MyClass extends Base{
    int code;

    MyClass(String txt, int n) {
        super(txt);
        code = n;
    }

    MyClass(MyClass obj) {
        super(obj);
        code = obj.code;
    }
    void show(){
        System.out.println("Текстовое поле: " + name);
        System.out.println("Целочисленное поле: " + code);
    }
}
