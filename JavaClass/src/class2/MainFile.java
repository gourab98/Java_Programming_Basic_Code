/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;

/**
 *
 * @author gourab
 */
public class MainFile 
{
    public static void main(String[] args)
    {
        Claculate calculator = new Claculate();
        
        System.out.println(calculator.addition(13, 19));
        
        System.out.println(calculator.a + "---" + calculator.b);
        calculator.print();
    }
}
