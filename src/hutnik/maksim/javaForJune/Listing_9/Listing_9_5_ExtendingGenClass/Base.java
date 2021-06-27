package hutnik.maksim.javaForJune.Listing_9.Listing_9_5_ExtendingGenClass;

class Base <X>{
    X data;
    Base(X data){
        this.data = data;
    }
    void show(){
        System.out.println(data);
    }
}
