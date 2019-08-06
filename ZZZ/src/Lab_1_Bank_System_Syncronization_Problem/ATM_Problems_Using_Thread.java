package Lab_1_Bank_System_Syncronization_Problem;

public class ATM_Problems_Using_Thread{
    public static void main(String[] args) {
 
        Banking bank =new Banking();
        customer c1 =new customer(bank,500);
        customer c2 =new customer(bank,1000);
        customer c3 =new customer(bank,1500);
        customer c4 =new customer(bank,2000);
        
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        
       
    
 
}
}