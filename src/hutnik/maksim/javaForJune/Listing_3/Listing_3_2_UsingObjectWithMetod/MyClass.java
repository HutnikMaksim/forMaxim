package hutnik.maksim.javaForJune.Listing_3.Listing_3_2_UsingObjectWithMetod;

class MyClass {
    int numder;
    char symbol;
    void set(int n, char s){
        numder = n;
        symbol = s;
    }
    String getInfo(){
        String text = "Число: " + numder + "\n";
        text += "Символ: " + symbol;
        return text;
    }
}
