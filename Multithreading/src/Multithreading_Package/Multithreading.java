package Multithreading_Package;

public class Multithreading implements Runnable{
    
    String threadName=" ";
    Thread t;
    
    public Multithreading (String name)
    {
        this.threadName=name;
        t =new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(threadName+" "+i);
        }
    }
    
}
