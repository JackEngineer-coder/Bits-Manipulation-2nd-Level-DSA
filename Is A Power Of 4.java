

import java.util.*;
public class Main {
  public static boolean isPowerOfFour(int n) {
    int fac = 0b01010101010101010101010101010101;
    return n>0 && (n&(n-1))==0 && (fac & n)>0;
  }
  public static void main(String[] args)
  
  {   
      Scanner scn= new Scanner(System.in);
      int n = scn.nextInt();
      System.out.println(isPowerOfFour(n));
      
  }
}
