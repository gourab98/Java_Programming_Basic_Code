/*
 * Here my task is to make a program that can take input from file and 
 *identify unique value and make a count of those words and show output in anothe file.
 */
package Assignment_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * @author gourab
 * Reg:2017831004
 */
public class FileParagraphTask {
    
     public static void main(String[] args) throws IOException {
         
         File file =new File("/home/gourab/NetBeansProjects/io_java/inputjava.txt");
         
         if(file.createNewFile())
         {
             System.out.println("File is created.");
         }
         else
         {
             System.out.println("File already exist.");
         }
   
       BufferedReader input=new BufferedReader(new FileReader(file));
       String str;
       ArrayList <String> arr =new ArrayList <>();
       while((str =input.readLine())!=null)
       {
           StringTokenizer to =new StringTokenizer(str," (),?!.=");
          while(to.hasMoreTokens())
       {
       arr.add(to.nextToken());          
       }
       }
         Collections.sort(arr);
         int couter =1;
         for(int i=1;i<arr.size();i++)
         {
             if(arr.get(i).equals(arr.get(i-1)))
             {
                 couter++;
             }
             else
             {
                 System.out.println(arr.get(i-1)+"  = "+couter);
                 couter=1;
             }
         }
            
}
}