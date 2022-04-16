import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int [] arr = new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i] = scn.nextInt();
    }
    int[][]q = new int[n][n];
    for(int i =0;i<q[0].length;i++)
    {
        for(int j =0;j<q[1].length;j++)
        {
            q[i][j] = scn.nextInt();
        }
    }
    
     int m = arr.length;
     int qs = q.length;
     int [] prefXor = new int [n];
     prefXor[0] = arr[0];
     for(int i=1;i<n;i++)
      {
          prefXor[i] = prefXor[i-1] ^ arr[i];
      }
      
     int [] ans = new int [qs];
     for(int i=0;i<qs;i++)
      {
          int left = q[i][0];
          int right = q[i][1];
          if(left==0)
          {
              ans[i] = prefXor[right];
              
          }
          else
          {
            ans[i] =  prefXor[right] ^ prefXor[left-1];  
          }
      }
      System.out.print(ans);
  }
  
}
