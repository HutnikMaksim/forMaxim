package hutnik.maksim.javaForJune.Listing_8.Listing_8_8_My;

class Run {
    static MyClass[] createObj(int n, char c){
        MyClass[] digits = new MyClass[n];
        // digits[0] = new MyClass(1, 'A');
        for (int i = 0; i < n; i++) {
            digits[i] = new MyClass(n * i, c++);
        }
        return digits;
    }
    static void show(MyClass[] obj){
        for (int i = 0; i < obj.length; i++) {
            System.out.print(obj[i].getI() + " - " + obj[i].getC() + " | ");
        }
    }

    public static void main(String[] args) {
        MyClass[] A = createObj(13, 'A');
        MyClass[] B = createObj(13, 'А');
        show(A);
        System.out.println();
        show(B);
    }
}
