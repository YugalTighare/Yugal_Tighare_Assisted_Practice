package exception;

public class Try_catch {
public static void main(String[] args) {
    	
    	try {
        	int a=2/0;  
        } 
    	catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurs");
        } 
    	finally {
            System.out.println("Done" + "\n");
        }
    	
    	try{    
            int a[]=new int[5];     
            a[6]=9;                                                        
           }    
    	catch(ArrayIndexOutOfBoundsException e)  
        {  
         System.out.println("ArrayIndexOutOfBoundsException occurs");  
        } 
    	finally {
            System.out.println("Done");
        }
        
    }
}