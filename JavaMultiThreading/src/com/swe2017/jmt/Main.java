/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swe2017.jmt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author gourab
 */
public class Main {
    static boolean busy = false;
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ITC_java itc1 = new ITC_java("one");
        ITC_java itc2 = new ITC_java("Two");
        
        itc1.start();
        itc2.start();
//        File f = new File("/home/gourab/Documents/Documents");
//        InputStreamReader ireader = new InputStreamReader(new FileInputStream(f));
//        BufferedReader in = new BufferedReader(ireader);
//        
//        in.read();
    }
}
