package BanglaMain;
/**
 *
 * @author gourab
 */
import java.util.Scanner;
public class BanglaClass { 
    public static void main(String[] args)
    {
    int a=2323;
    int b=12;
    int c;
    
    try{
    c=a/b; 
    }
    
    catch(Exception e)
    {
        System.out.println("Divided by zero is not possible.");
    }
    
    System.out.print(c);
        System.out.println("Go on.");
    
}
}

