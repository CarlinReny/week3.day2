package week3.day2;

import java.util.*;
public class Palindrome{
    
    // Main 
    public static void main(String[] args){
        
     String S = "madam";
     
       
          // Convert String to character array
        char ch[]=S.toCharArray();  
        // Reversing the String
            String reverseString="";  
            for(int i=ch.length-1;i>=0;i--){  
                reverseString+=ch[i];  
            }  
        
        //Checking Palindrome
        if(S.equals(reverseString)){
            System.out.println("\n"+S+" is a Palindrome String ");
        }else{
            System.out.println(""+S+" is Not a Palindrome String ");
        }
        
    }
    
}