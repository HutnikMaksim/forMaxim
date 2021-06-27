package hutnik.maksim.javaForJune.Listing_10.Listing_10_5_MethReference;

class MethReferenceDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass(100);
        System.out.println("Создан объект с полем 100");
        MyGetter A = MyClass::get;
        MySetter B = MyClass::set;
        System.out.println("Переменная А: " + A.myget(obj));
        System.out.println("Переменная obj: " + obj.get());
        obj.set(200);
        System.out.println("Полю присвоено значение 200");
        System.out.println("Переменная А: " + A.myget(obj));
        B.myset(obj, 300);
        System.out.println("Выполнена команда B.myset(obj, 300)");
        System.out.println("Переменная А: " + A.myget(obj));
        System.out.println("Переменная obj: " + obj.get());
        obj = new MyClass(400);
        System.out.println("Сoздан объект с полем 400");
        System.out.println("Переменная А: " + A.myget(obj));
        System.out.println("Переменная obj: " + obj.get());
        B.myset(obj, 500);
        System.out.println("Выполнена команда B.myset(500)");
        System.out.println("переменная А: " + A.myget(obj));
        System.out.println("Переменная obj: " + obj.get());
    }
}
