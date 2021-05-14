package hutnik.maksim.javaForJune.Listing_3.Listing_3_5_UsingStaticMembers;

class MyClass {
    static int count = 0;
    MyClass(){
        count++;
        System.out.println("Создан объект номер " + count);
    }
    static void show(){
        System.out.println("Количество объектов: " + count);
    }
}
