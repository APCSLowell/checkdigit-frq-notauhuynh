public class CheckDigit 
{   
   public static int getCheck(int num) 
   {  
      ArrayList <Integer> nums = new ArrayList<Integer>();
      while(num > 0){
        nums.add(0, num % 10);
        num = num / 10;
      }
      int multi = 7;
      int total = 0;
      for(int i = 0; i < nums.size(); i++){
        total = total + (nums.get(i) * multi);
        multi--;
      }
     return total;
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
