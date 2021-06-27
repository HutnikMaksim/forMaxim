package hutnik.maksim.javaForJune.Listing_8.Listing_8_10_ZMy;

class Bank {
    public int contoBank;
    private double rateBank;

    Person personObj;
    public Bank(int coBa, double raBa, String txt, char sym){
        contoBank = coBa;
        rateBank = raBa;
        personObj = new Person(txt, sym);
    }


    class Person{
        String namePerson;
        char symbol;

        public Person(String txt, char sym) {
            namePerson = txt;
            symbol = sym;
        }
        int res = (int) rateBank * contoBank;

        void show(){
            System.out.print(namePerson + " " + symbol + " " + rateBank + " " + contoBank + " " + res);
        }
    }
}
