package hutnik.maksim.javaForJune.Listing_10.Listing_10_11_LambdaAsField;

class LambdaAsFieldDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass((int n) -> {return n * n;});
        System.out.println("Аргумент:");
        for(int i = 0; i <= 5; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("\nАргумент в квадрате:");
        for(int i = 0; i <= 5; i++) {
            System.out.print(obj.get(i) + "\t");
        }
        obj.set((int n) -> {return n * n * n;});
        System.out.println("\nАргумент в кубе:");
        for(int i = 0; i <= 5; i++) {
            System.out.print(obj.get(i) + "\t");
        }
        System.out.println();
    }
}
