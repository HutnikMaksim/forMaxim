package hutnik.maksim.javaForJune.Listing_9.Listing_9_2_UsingGenerics;

class Alpha <X>{
    private X first;
    Alpha(X first){
        set(first);
    }
    void set(X first){
        this.first = first;
    }
    X get(){
        return first;
    }
}
