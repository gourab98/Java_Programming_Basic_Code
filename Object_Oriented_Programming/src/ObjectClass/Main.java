package ObjectClass;

public class Main {

    int x=100;
    static void myMethod(){
        System.out.println("Static methods");
    }
    
    public void publicMethod(){
        System.out.println("Public Methods");
    }

    
    public static void main(String[] args) {
        Main object = new Main();
        myMethod();
        object.publicMethod();
        System.out.println("value: "+object.x);
    }
}
