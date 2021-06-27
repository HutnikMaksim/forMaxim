package hutnik.maksim.javaForJune.Listing_12.Listing_12_5_MainThread;

class MainThreadDemo {
    public static void main(String[] args) {
        Thread t;
        t = Thread.currentThread();
        System.out.println(t);
        t.setName("Главный поток");
        t.setPriority(7);
        System.out.println(t);
    }
}
