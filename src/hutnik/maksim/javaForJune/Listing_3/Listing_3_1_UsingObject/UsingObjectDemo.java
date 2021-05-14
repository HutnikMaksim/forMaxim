package hutnik.maksim.javaForJune.Listing_3.Listing_3_1_UsingObject;

class UsingObjectDemo {
    public static void main(String[] args) {
        MyClass objMyClass = new MyClass();
        objMyClass.name = objMyClass.name + " " + objMyClass.word + " Gutnik";
        int h = objMyClass.value - 2;
        System.out.println("My name is: " + objMyClass.name + " my height is: " + h + " cm");
    }
}
