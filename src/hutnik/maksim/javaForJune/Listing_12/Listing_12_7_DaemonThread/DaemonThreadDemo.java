package hutnik.maksim.javaForJune.Listing_12.Listing_12_7_DaemonThread;

import javax.swing.*;

class DaemonThreadDemo {
    public static void main(String[] args) throws InterruptedException{
        Thread t = new Thread(() -> {
            int i = 1, s = 1;
            while(true){
                System.out.println(Thread.currentThread().getName() + ": " + "\t" + i + "\t" + s);
                try {
                    Thread.sleep(1000);
                }catch(InterruptedException e){}
                i++;
                s += i;

            }
        },"Вычисление суммы");
        t.setDaemon(true);
        int res;
        t.start();
        do{
            Thread.sleep(1000);
            res = JOptionPane.showConfirmDialog(null,"Закончить вычисление суммы?", "Сумма чисел", JOptionPane.YES_NO_OPTION);
        } while(res != JOptionPane.YES_OPTION);
    }
}
