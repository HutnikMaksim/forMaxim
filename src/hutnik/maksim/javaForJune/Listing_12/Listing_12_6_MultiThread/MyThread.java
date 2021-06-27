package hutnik.maksim.javaForJune.Listing_12.Listing_12_6_MultiThread;

import java.util.Random;

class MyThread extends Thread{
    private int count;
    MyThread(String name,int count){
        super(name);
        this.count = count;
        start();
    }
    public void run(){
        System.out.println("Выполняется поток " + getName());
        Random rnd = new Random();
        for(int i = 1; i <= count; i++) {
            System.out.println("Сообщение потока " + getName() + "\t" + getName().charAt(0) + i);
            try {
                Thread.sleep(1000 + rnd.nextInt(2001));
            } catch(InterruptedException e){
                System.out.println("Прерывание потока " + getName());
            }
        }
        System.out.println("Поток " + getName() + " завершён");
    }
}
