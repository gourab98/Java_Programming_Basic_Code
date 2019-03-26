/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading_Package;

/**
 *
 * @author gourab
 */
public class Main {
    public static void main(String[] args) {
        Multithreading t1 =new Multithreading("One");
        Multithreading t2 =new Multithreading("Two");
        
        Thread t=new Thread(t1);
        t.start();
        
        t=new Thread(t2);
        t.start();
    }
    
}
