
package Constructor;

public class Main {
    int modelYear;
    String carName;
    
    public Main(int x, String  y){
        this.modelYear=x;
        this.carName=y;
    }
    
    public static void main(String[] args) {
        Main car =new Main(1990,"Mustang");
        System.out.println("My car: "+ car.carName+
        " & Model year: "+ car.modelYear);
        
        
    }
}
