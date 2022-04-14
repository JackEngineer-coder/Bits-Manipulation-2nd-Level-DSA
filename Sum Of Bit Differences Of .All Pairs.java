import java.io.*;
import java.util.*;

public class Main {

  public static long solution(int[] arr){
    long res=0;
    
    for(int i=0;i<32;i++)
    {
        int countOn=0;
        for(int val:arr)
        {
            if((val &(1<<i))!=0)
            {
                countOn++;
            }
        }
        long countOff = arr.length - countOn;
        
        long diff= countOn*countOff*2;
        res += diff;
    }
    
    return res;
  }

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < arr.length; i++){
      arr[i] = scn.nextInt();
    }
    System.out.println(solution(arr));
  }

}
