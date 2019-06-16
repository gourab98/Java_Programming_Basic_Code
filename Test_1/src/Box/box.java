
package Box;


public class box {
    
    double height,width,depth;
    
    box(double h,double w,double d){
        
        height=h;
        width=w;
        depth=d;
    }
    void displayvol ()
    {
        double vol=height*width*depth;
        System.out.println("Volume is :"+vol);
    }
  
}

