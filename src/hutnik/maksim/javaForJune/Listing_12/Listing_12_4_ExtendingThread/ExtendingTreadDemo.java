package hutnik.maksim.javaForJune.Listing_12.Listing_12_4_ExtendingThread;

class ExtendingTreadDemo {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Начинается выполнение программы");
        MyThread t = new MyThread();
        System.out.println("Запускается дочерний поток");
        t.start();
        for(int i = 0; i <= 5; i++) {
            System.out.println("Главный поток:\t" + (char)('A' + i));
            Thread.sleep(2000);
        }
        if(t.isAlive()){
            t.join();
        }
        System.out.println("Выполнение программы завершено");
    }
}
