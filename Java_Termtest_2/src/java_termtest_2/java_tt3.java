package java_termtest_2;

class javatest extends java_tt3{
    @Override
    void move()
        {
            
        System.out.println("I am from javatest");
        
        }
    
}

public class java_tt3 extends java_tt2 {
       
    public static void main(String[] args) {
        
       java_tt1 p1= new javatest();
       java_tt2 p2= new javatest();
       java_tt3 p3= new javatest();
       
       p1.move();
       p2.move();
       p3.move();
       
       
    }
    
}
