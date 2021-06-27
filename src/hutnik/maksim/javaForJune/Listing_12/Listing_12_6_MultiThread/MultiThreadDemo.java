package hutnik.maksim.javaForJune.Listing_12.Listing_12_6_MultiThread;

class MultiThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Начинает выполняться главный поток");
        MyThread A = new MyThread("Alpha", 5);
        MyThread B = new MyThread("bravo", 3);
        MyThread C = new MyThread("CHARLIE", 7);
        for(int i = 1; i <= 4; i++) {
            System.out.println("Сообщение о главного потока: \t" + i);
            Thread.sleep(2000);
        }
        if(A.isAlive()){
            A.join();
        }
        if(B.isAlive()){
            B.join();
        }
        if(C.isAlive()){
            C.join();
        }
        System.out.println("Главный поток завершён");
    }
}
