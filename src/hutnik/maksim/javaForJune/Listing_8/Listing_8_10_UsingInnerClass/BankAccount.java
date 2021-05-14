package hutnik.maksim.javaForJune.Listing_8.Listing_8_10_UsingInnerClass;
import static javax.swing.JOptionPane.*;
class BankAccount {
    double rate;
    Person fellow;
    BankAccount(String name, double money, int time, double r){
        rate = r;
        fellow = new Person(name, money, time);
    }
    void show(){
        showMessageDialog(null, fellow,"Депозит", 1);
    }
}
