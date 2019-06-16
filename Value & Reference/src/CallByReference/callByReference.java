
package CallByReference;


public class callByReference {
    public static void main(String[] args) {
        
        referenceTest s=new referenceTest();
        s.name="Gourab";
        s.number=10;
        
        System.out.println("Before call "+s.name);
        System.out.println("Before call "+s.number);
        
        s.changes(s);
        s.change(s);
        
        System.out.println("After call "+s.name);
        System.out.println("After call "+s.number);
    }
    
}
