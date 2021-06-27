package hutnik.maksim.javaForJune.Listing_9.Listing_9_8_MoreGenInterface;

class MoreGenInterfaceDemo {
    public static void main(String[] args) {
        MyMethods ref;
        Alpha A = new Alpha(123);
        Bravo B = new Bravo('A');
        A.show();
        ref = A;
        ref.set(321);
        A.show();
        B.show();
        ref = B;
        ref.set('B');
        B.show();
    }
}
