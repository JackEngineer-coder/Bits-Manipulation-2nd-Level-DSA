import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int i = scn.nextInt();
    int j = scn.nextInt();
    int k = scn.nextInt();
    int m = scn.nextInt();
    
    int bmforor = (1<<i);
    int bmforand = ~(1<<j);
    int bmfortoggle = (1<<k);
    int bmforcheck = (1<<m);
    
    System.out.println(n | bmforor);
    System.out.println(n & bmforand);
    System.out.println(n ^ bmfortoggle);
    System.out.println((n & bmforcheck) ==0? false :true);
    
  }

}
