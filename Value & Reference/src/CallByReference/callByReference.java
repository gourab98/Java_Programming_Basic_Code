
package CallByReference;


public class callByReference {
    public static void main(String[] args) {
        
        referenceTest s=new referenceTest();
        s.name="Gourab";
        System.out.println("Before call "+s.name);

        s.change(s);
        System.out.println("After call "+s.name);
    }
    
}
