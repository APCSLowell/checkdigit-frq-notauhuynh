public class CheckDigit 
{   
   public static int getCheck(int num) 
   {  
      int total = 0;
      int mult = 7;
      for(int i = 0; i < getNumberOfDigits(num) + 1; i++){
         total = total + (getDigit(num, i + 1) * mult);
         mult--;
      }
      return total % 10;
   }
 
  /** Returns true if numWithCheckDigit is valid, or false    
   *  otherwise, as described in part (b). 
   *  Precondition: The number of digits in numWithCheckDigit   
   *  is between two and seven, inclusive.
   *                numWithCheckDigit >= 0     
   */     
   public static boolean isValid(int numWithCheckDigit)    
   {      
     int hold = numWithCheckDigit % 10;
     numWithCheckDigit = numWithCheckDigit / 10;
     if(hold == getCheck(numWithCheckDigit)){
       return true;
     }
     return false;
   }    
   
   /** Returns the number of digits in num. */    
   public static int getNumberOfDigits(int num)    
   {      
    if(num < 10)
      return 1;
    return 1 + getNumberOfDigits(num/10);    
   }    
   
   /** Returns the nthdigit of num.      
    *  Precondition: n >= 1 and n <= the number of digits in num     
    */    
    public static int getDigit(int num, int n)    
    {      
      int pos = getNumberOfDigits(num)-n+1;
      while(pos > 1){
        num/=10;
        pos--;
      }
      return num%10;
    }     

}
