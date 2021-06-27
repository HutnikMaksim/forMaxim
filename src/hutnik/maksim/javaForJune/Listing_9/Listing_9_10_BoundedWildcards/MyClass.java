package hutnik.maksim.javaForJune.Listing_9.Listing_9_10_BoundedWildcards;

class MyClass <T>{
    private T obj;

    @Override
    public String toString() {
        return obj.toString();
    }
    MyClass(T arg){
        obj = arg;
    }
}
