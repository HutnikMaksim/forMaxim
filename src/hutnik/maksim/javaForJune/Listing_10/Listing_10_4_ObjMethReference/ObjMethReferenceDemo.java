package hutnik.maksim.javaForJune.Listing_10.Listing_10_4_ObjMethReference;

class ObjMethReferenceDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass(100);
        System.out.println("Создан объект с полем 100");
        MyGetter A = obj::get;
        MySetter B = obj::set;
        System.out.println("Переменная А: " + A.myget());
        System.out.println("Переменная obj: " + obj.get());
        obj.set(200);
        System.out.println("Полю присвоено значение 200");
        System.out.println("Переменная А: " + A.myget());
        B.myset(300);
        System.out.println("Выполнена команда B.myset(300)");
        System.out.println("Переменная А: " + A.myget());
        System.out.println("Переменная obj: " + obj.get());
        obj = new MyClass(400);
        System.out.println("СОздан объект с полем 400");
        System.out.println("Переменная А: " + A.myget());
        System.out.println("Переменная obj: " + obj.get());
        B.myset(500);
        System.out.println("Выполнена команда B.myset(500)");
        System.out.println("переменная А: " + A.myget());
        System.out.println("Переменная obj: " + obj.get());
    }
}
