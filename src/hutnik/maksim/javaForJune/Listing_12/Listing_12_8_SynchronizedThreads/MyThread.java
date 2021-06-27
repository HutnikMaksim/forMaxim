package hutnik.maksim.javaForJune.Listing_12.Listing_12_8_SynchronizedThreads;

class MyThread extends Thread{
    private MyNumber obj;
    private int time;
    private int count;
    private boolean state;
    MyThread(String name, MyNumber obj, int time, int count, boolean state){
        super(name);
        this.obj = obj;
        this.time = time;
        this.count = count;
        this.state = state;
        start();
    }
    private void line(){
        char s;
        if(state){
            s = '-';
        } else s = '*';
        for(int i = 1; i <= 35; i++) {
            System.out.print(s);
        }
        System.out.println();
    }
    public void run(){
        for(int i = 1; i <= count; i++) {
            synchronized(obj){
                line();
                System.out.println("Поток " + getName() + ": исходное значение " + obj.number);
                try {
                    Thread.sleep(time);
                } catch(InterruptedException e){
                    System.out.println(e);
                }
                if(state){
                    obj.number++;
                } else {
                    obj.number--;
                }
                System.out.println("Поток " + getName() + ": новое значение " + obj.number);
                line();
            }
        }
    }
}
