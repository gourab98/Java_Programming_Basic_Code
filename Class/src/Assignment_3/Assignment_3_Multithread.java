/*
*It is a multithread example, Here we try to print things sesquencially
 */
package Assignment_3;

/**
 *
 * @author gourab
 */
class Task extends Thread{
    @Override
    public void run()
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println("## Printing the document ("+i+") in printer -2");
        }
    }
}
public class Assignment_3_Multithread {
    public static void main(String[] args) {
        
        System.out.println("\"\"Application Starts\"\"");
    
    Task mytask=new Task();
    mytask.start();
    
    for (int i = 1; i <= 10; i++) {
            System.out.println("## Printing the document ("+i+") in printer -1");
        }
        System.out.println("\"\"Application Ends\"\"");
    
    }
    
}
