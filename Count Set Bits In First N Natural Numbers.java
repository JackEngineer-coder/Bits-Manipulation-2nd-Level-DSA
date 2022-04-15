import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(solution(n));
  }

  public static int solution(int n){
      
      if(n==0)
      {
          return 0;
      }
      int x = powerreturn(n);
      int bittill = x*(1<<(x-1));
      int MSB = n-(1<<x)+1;
      int rest = n - (1<<x);
      int ans = bittill + MSB + solution(rest);
    
      return ans;
  }
  public static int powerreturn(int n)
  {
      int x=0;
      while((1<<x)<=n)
      {
          x++;
      }
      return x-1;
  }

}
