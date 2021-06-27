package hutnik.maksim.javaForJune.Listing_9.Listing_9_6_GenTypeExtending;

class Delta extends Bravo{
    double val;
    Delta(String txt, int n, char s, double val) {
        super(txt, n, s);
        this.val = val;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Вещественное поле: " + val);
    }
}
