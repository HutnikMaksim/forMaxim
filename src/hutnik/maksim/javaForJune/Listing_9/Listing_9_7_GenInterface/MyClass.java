package hutnik.maksim.javaForJune.Listing_9.Listing_9_7_GenInterface;

class MyClass <X> implements MyMethods <X>{
    private X value;

    @Override
    public X get() {
        return value;
    }

    @Override
    public void set(X arg) {
        value = arg;
    }

    void show(){
        System.out.println("Значение поля: " + get());
    }

    MyClass(X arg){
        value = arg;
    }
}
