import java.io.*;
import java.util.*;

public class Main {

  public static int solution(int n){
    int powerRaiseTo = HighestPower(n);
    int ans = n-powerRaiseTo;
    
    return 2*ans+1;
    
    

  }
  public static int HighestPower(int n)
  {
      int p  =1;
      while(2*p<=n)
      {
          p = 2*p;
      }
      return p;
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(solution(n));
  }
  

}
