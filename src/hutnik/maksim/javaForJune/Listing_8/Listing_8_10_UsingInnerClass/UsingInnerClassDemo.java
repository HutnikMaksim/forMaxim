package hutnik.maksim.javaForJune.Listing_8.Listing_8_10_UsingInnerClass;

class UsingInnerClassDemo {
    public static void main(String[] args) {
        BankAccount ivanov = new BankAccount(
                "Иван Иванов",
                1000.0,
                5,
                8.0
        );
        ivanov.show();
    }
}
