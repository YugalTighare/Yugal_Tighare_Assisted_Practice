package string.demo;

import java.io.*; 
import java.lang.*; 
import java.util.*; 
 
class ArrayOfString { 
 
     public static void main(String[] args) 
    {         
         String[] words = new String[]{"C++", "Java", "C", "Python"};
 
        // Convert String Array to List
        List<String>wordslist = Arrays.asList(words);
        String tochk = "Java";
        if(wordslist.contains(tochk)){
           System.out.println("The word " + tochk + " present in string array");
        }
       else
       System.out.println("The word " + tochk + " not present in string array" );
    }
}
