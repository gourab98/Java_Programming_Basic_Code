
package Test_7;


public class ExcepTest {
    public static void main(String[] args) {
        
        try{
            int a[]=new int[2];
            System.out.println("Access Element Three:"+a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The exception is "+e);
        }
        finally {
            System.out.println("Go One");
    }
    }
}
