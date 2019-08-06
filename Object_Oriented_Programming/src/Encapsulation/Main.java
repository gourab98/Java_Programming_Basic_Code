/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author gourab
 */
public class Main {
    public static void main(String[] args) {
        NameClass name= new NameClass();
        
        name.setName("Gourab Saha");
        System.out.println("The name is :"+name.getname());
    }
}
