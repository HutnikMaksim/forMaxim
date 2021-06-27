package hutnik.maksim.javaForJune.Listing_12.Listing_12_4_ExtendingThread;

class MyThread extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++) {
            System.out.println("Дочерний поток:\t" + i);
            try {
                Thread.sleep(4500);
            } catch(InterruptedException e){
                System.out.println("Прерывание дочернего потока");
            }
        }
    }
}
