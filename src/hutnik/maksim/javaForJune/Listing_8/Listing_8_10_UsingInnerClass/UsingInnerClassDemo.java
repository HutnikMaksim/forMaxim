package hutnik.maksim.javaForJune.Listing_8.Listing_8_10_UsingInnerClass;

class UsingInnerClassDemo {
    public static void main(String[] args) {
        BankAccount ivanov = new BankAccount("Иван Иванов", 1000.0, 5, 8.0); /* Создание объекта
        ivanov класса BankAccount, и одновременно передача аргументов в конструктор класса BankAccount*/
        ivanov.show(); // Вызов метода show() из объекта ivanov
    }
}
