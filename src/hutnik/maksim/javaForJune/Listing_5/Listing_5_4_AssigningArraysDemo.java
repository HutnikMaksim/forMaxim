package hutnik.maksim.javaForJune.Listing_5;

class Listing_5_4_AssigningArraysDemo {
    static void show(int[] nums){
        for (int s : nums){
            System.out.print("|" + s);
        }
        System.out.println("|");
    }
    public static void main(String[] args) {
        int[] odd = {1, 3, 5, 7, 9};
        int[] even = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("Массив odd:");
        show(odd);
        System.out.println("Массив even:");
        show(even);
        System.out.println("Выполняетс присваивание...");
        even = odd;
        even[0] = 1; // Не понял для чего это делается, если и без него всё работает?
        System.out.println("Массив odd:");
        show(odd);
        System.out.println("Массив even:");
        show(even);
    }
}
