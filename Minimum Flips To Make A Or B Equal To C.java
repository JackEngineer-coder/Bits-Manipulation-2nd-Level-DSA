import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
    scn.close();
    
    int ans =Solution(a,b,c);
    System.out.print(ans);
  }
  public static int Solution(int a, int b, int c)
  {
      
    int ans =0;
    for(int i=0;i<32;i++)
    {
        boolean ai = false;
        boolean bi= false;
        boolean ci=false;
        if( (a & (1 << i))>0)
        {
            ai = true;
        }
         if( (b & ( 1<< i ))> 0 )
        {
            bi = true;
        }
         if( (c &(1<<i))>0)
        {
           ci = true; 
        }
        if(ci)
        {
            if(! ai && ! bi)
            {
                ans++;
            }
        }
        else
        {
            if(ai && bi)
            {
               ans +=2; 
            }
            else if(ai|| bi)
            {
                ans++;
            }
        }
    }
    return ans;
}
  
 
}
