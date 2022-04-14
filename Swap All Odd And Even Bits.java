import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int evenMask = 0xAAAAAAAA;
    int oddMask = 0x55555555;
    
    int even = n&evenMask;
    int odd = n&oddMask;
    
    even >>= 1; // rotate left for even bits
    odd <<= 1; // rotate right for odd bits
    
    n = even | odd;
    
    System.out.println(n);
    
  }

}
