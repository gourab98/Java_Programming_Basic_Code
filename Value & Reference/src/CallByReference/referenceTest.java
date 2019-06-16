
package CallByReference;


public class referenceTest {
    
    String name;
    int number;
    void changes(referenceTest p){
        p.number=1;
    }
    void change(referenceTest g)
    {
        g.name="Saha.";
    }
}
