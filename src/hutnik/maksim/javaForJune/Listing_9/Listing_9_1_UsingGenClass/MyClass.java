package hutnik.maksim.javaForJune.Listing_9.Listing_9_1_UsingGenClass;

class MyClass <X>{
    X data;
    MyClass(X data){
        this.data = data;
    }
    void show(){
        System.out.println("Значение поля: " + data);
    }
}
