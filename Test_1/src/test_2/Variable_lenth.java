
package test_2;


public class Variable_lenth {
    
    void add(int ... num){
        
        int sum=0;
        
        for(int x:num)
        {
          sum=sum+x;           
        }
        
      System.out.println(sum);
    }
}
