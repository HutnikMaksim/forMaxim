package hutnik.maksim.javaForJune.Listing_3.Listing_3_4_UsingConstructor;

class UsingConstrutorDemo {
    public static void main(String[] args) {
        MyClass objMyClass1 = new MyClass();
        MyClass objMyClass2 = new MyClass(200 , 'B');
        System.out.println("objMyClass1: ");
        objMyClass1.show();
        System.out.println("objMyClass2: ");
        objMyClass2.show();
    }
}
