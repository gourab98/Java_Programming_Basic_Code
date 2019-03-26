
package inheritance;

public class Inheritance {

    public static void main(String[] args) {
        int a=10,b=20;
        My_Calculation g=new My_Calculation();
        g.addition(a, b);
        g.subtraction(a, b);
        g.multiplication(a, b);
        
    }
    
}

class Calculator{
int z;
public void addition(int x,int y)
{
    z=x+y;
    System.out.println("The Sum "+z);
}
public void subtraction(int x,int y)
{
    z=x-y;
    System.out.println("The Subtract "+z);
}
}
class My_Calculation extends Calculator
{
    public void multiplication(int x,int y)
    {
        z=x*y;
        System.out.println("Multiplication "+z);
    }
}

    

