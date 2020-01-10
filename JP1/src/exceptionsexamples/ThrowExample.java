package exceptionsexamples;

import java.io.IOException;

public class ThrowExample {
   static void checkEligibilty(int stuage, int stuweight) throws MyException, IOException, ClassNotFoundException{ 
      if(stuage<12 && stuweight<40) {        
         throw new MyException("Student is not eligible for registration");
      }
      else {
         System.out.println("Student Entry is Valid!!");
         throw new ArithmeticException("Student Entry is Valid");
      }
   } 

   public static void main(String args[]) { 
     System.out.println("Welcome to the Registration process!!");
     try{
         checkEligibilty(10, 39);    	 
     }catch(Exception e){
    	 System.out.println(e);
    	 System.out.println(e.getMessage());
    	 System.out.println(e.getStackTrace());
     }
 
      
 } 
}