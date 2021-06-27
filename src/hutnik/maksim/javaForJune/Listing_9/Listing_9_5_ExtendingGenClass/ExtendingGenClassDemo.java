package hutnik.maksim.javaForJune.Listing_9.Listing_9_5_ExtendingGenClass;

class ExtendingGenClassDemo {
    public static void main(String[] args) {
        Alpha A = new Alpha(123);
        Bravo B = new Bravo("Объект В");
        Charlie C = new Charlie('C');
        Delta D = new Delta(B.data);
        A.show();
        B.show();
        C.show();
        D.show();
    }
}
