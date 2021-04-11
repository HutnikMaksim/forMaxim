package hutnik.maksim.javaForJune.static_Metods_Polya;

class Runner {
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
