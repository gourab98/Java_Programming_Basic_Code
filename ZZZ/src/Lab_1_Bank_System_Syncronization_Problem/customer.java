
package Lab_1_Bank_System_Syncronization_Problem;

import java.util.logging.Level;
import java.util.logging.Logger;

public class customer extends Thread{
    Banking bank;
    int withdraw_money;
    
    public customer(Banking bank,int withdraw_money)
    {
        this.bank=bank;
        this.withdraw_money=withdraw_money;
    }
    

public void run()
{
        try {
            bank.withdraw(withdraw_money);
        } catch (InterruptedException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }
}

}