package hutnik.maksim.javaForJune.Listing_9.Listing_9_2_UsingGenerics;

class UsingGenericsDemo {
    public static void main(String[] args) {
        Bravo<Integer, Character> A = new Bravo<>(100, 'A');
        A.show();
        Bravo<String, Double> B = new Bravo<>("Bravo", 12.345);
        B.show();
    }
}
