import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int counter =0;
    while(n!=0)
    {
        int rsb = n & -n;
        n-= rsb;
        counter++;
    }
    System.out.println(counter);
  }

}
