package Multithreading_Package;

public class Multithreading implements Runnable{
    
    String threadName=" ";
    Thread t;
    private Object threadname;
    
    public Multithreading (String name)
    {
        this.threadName=name;
//        t =new Thread(this, name);
//        t.start();
    }
    synchronized public void Operation(int add)
    {
        Main.glob_var+=add;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(!threadName.equalsIgnoreCase("One")) {
                Operation(1);
            } else {
               Operation(-1);
            }
            System.out.println(Main.glob_var);
    }
    
}
}
