/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swe2017.jmt;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gourab
 */
public class ITC_java extends Thread{

    String name;
    public ITC_java(String name) {
        this.name = name;
    }

    
    synchronized void print(String s) throws InterruptedException{
        if(Main.busy){
            System.out.println(s+" waiting");
            wait();
        }
        
        Main.busy = true;
        
        for (int i = 0; i < 10; i++) {
            System.out.println(s+ " running.");
            Thread.sleep(50);
        }
        Main.busy = false;
        notify();
    }
    
    
    @Override
    public void run() {
        try {
            //        System.out.println("");
            print(name);
        } catch (InterruptedException ex) {
            Logger.getLogger(ITC_java.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
