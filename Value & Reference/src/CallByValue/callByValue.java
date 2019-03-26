
package CallByValue;


public class callByValue {
    public static void main(String[] args) {
        
        valueTest val=new valueTest();
        int x=100;
        System.out.println("x before call "+x);
        
        val.change(x);
        System.out.println("x after call "+x);
    }
}
