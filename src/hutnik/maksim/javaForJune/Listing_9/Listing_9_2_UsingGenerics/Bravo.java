package hutnik.maksim.javaForJune.Listing_9.Listing_9_2_UsingGenerics;

class Bravo <X, Y>{
    Alpha<X> obj;
    Y second;
    Bravo(X first, Y second){
        obj = new Alpha<X>(first);
        this.second = second;
    }
    void show(){
        System.out.println("Значения " + obj.get() + " и " + second);
    }
}
