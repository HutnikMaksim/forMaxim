package hutnik.maksim.javaForJune.Listing_3.Listing_3_6_UsingPrivateMembers;

class UsingPrivateMembersDemo {
    public static void main(String[] args) {
        MyClass objA = new MyClass("Alfa");
        MyClass objB = new MyClass("Bravo");
        MyClass objC = new MyClass("Charlie");
        objA.show();
        objB.show();
        objC.show();
        objB.set("Второй объект");
        objB.show();

    }
}
