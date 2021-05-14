package hutnik.maksim.javaForJune.Listing_7.Listing_7_2_UsingInterface;

class UsingInterfaceDemo {
    public static void main(String[] args) {
        MyClass objMyClass = new MyClass();
        System.out.println("Статическая константа: " + MyClass.NUMBER);
        System.out.println("Целое число: " + objMyClass.getNumber(12.5));
        System.out.println("Символ: " + objMyClass.getSymbol(3));
    }
}
