
package Recursion;

public class recursion {
    public static void main(String[] args) {
       
        int a=4;
       factorial ob=new factorial();
        
        int b=ob.fact(a);
        System.out.println(b);
        
      
      
    }
}
    class factorial{
         int fact(int num)
        {
        if(num==1)
            return 1;
        else
            return num*fact(num-1);
        } 
    }

