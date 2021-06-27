package hutnik.maksim.javaForJune.Listing_8.Listing_8_7_ArrayAsField;

class Binominal {
    private int[] binoms;
    Binominal(int n){
        binoms = new int[n + 1];
        binoms[0] = 1;
        for (int i = 1; i <= n; i++) {
            binoms[i] = binoms[i - 1] * (n - i + 1) / i;
        }
    }
    public String toString(){
        String txt = "|";
        for (int i = 0; i < binoms.length; i++) {
            txt += binoms[i] + "|";
        }
        return txt;
    }
}