
package Test_6;

import java.util.Arrays;


public class NewMain {
    public static void main(String[] args) {
        String s1="SWE 2nd Batch";
        String s2="Java OOP";
        String s3="IICT SUST";
        
        System.out.println(s1.substring(0,7));
        System.out.println(s1.concat(s2).concat(s3));
        System.out.println(s3.lastIndexOf('T'));
        System.out.println(s2.replace("OOP",""));
        System.out.println(s2.toLowerCase());
        System.out.println(Arrays.toString(s1.split(" ")));
        System.out.println(s2.trim().length());
        System.out.println(s2.equalsIgnoreCase("Java ooP"));
        System.out.println(s1.charAt(4));
              
        
    }
}
