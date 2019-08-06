
package Lab_1_Bank_System_Syncronization_Problem;

public class Banking {
    
    int balance =100000;
    
    synchronized void withdraw( int money) throws InterruptedException
    {
        System.out.println("Withdraw");
        System.out.println("Current Bank's balance "+balance);
                        
             balance =balance-money;
                
          System.out.println("withdraw "+money);
          System.out.println("Now the current Bank's balance is "+balance);   
        
        }

}



