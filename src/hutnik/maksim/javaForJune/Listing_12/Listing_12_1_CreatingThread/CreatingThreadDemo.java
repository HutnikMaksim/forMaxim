package hutnik.maksim.javaForJune.Listing_12.Listing_12_1_CreatingThread;

class CreatingThreadDemo {
    public static void main(String[] args) {
        System.out.println("Начинается выполнение программы");
        Thread t = new Thread(new MyThread());
        System.out.println("Запускается дочерний поток");
        t.start();
        for(int i = 0; i <= 5; i++) {
            System.out.println("Главный поток:\t" + (char)('A' + i));
            try {
                Thread.sleep(2000);
            } catch(InterruptedException e){
                System.out.println("Прерывание главного потока");
            }
        }
        System.out.println("Выполнение программы завершено");
    }
}
