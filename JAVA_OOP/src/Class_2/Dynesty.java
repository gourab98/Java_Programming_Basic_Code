/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_2;

/**
 *
 * @author gourab
 */
public class Dynesty extends Car{
    public void printInfo(){
        System.out.println(super.isDicky);
    }
    
    public static void main(String[] args)
    {
        Dynesty d=new Dynesty();
         
        System.out.println(d.isDicky);
    }

    @Override
    public String whatColor() {
        return super.whatColor(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String whatColor(int val)
    {
        return "red";
    }
    
}
