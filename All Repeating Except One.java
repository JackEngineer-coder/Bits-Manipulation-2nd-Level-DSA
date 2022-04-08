import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n; i++){
      arr[i] = scn.nextInt();
    }
    
    int unique =0;
    for(int val : arr)
    {
        unique = unique ^ val;
        
    }
    System.out.println(unique);
    
  }

}
