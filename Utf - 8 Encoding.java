import java.io.*;
import java.util.*;

public class Main {

    public static boolean solution(int[] arr) {
       int remainingBytes = 0;
       
       for(int val:arr)
       {
         if(remainingBytes==0)
         {
           if((val>>7)==0b0) // rotate bit 7 times and check is it 1 byte character
           {
               remainingBytes = 0;
           }
           else if((val>>5)==0b110) // rotate bit 5 times and check is it 2 byte character
           {
               remainingBytes = 1;
           }
           else if((val>>4)==0b1110) // rotate bit 4 times and check is it 3 byte character
           {
               remainingBytes = 2;
           }
           else if((val>>3)==0b11110) // rotate bit 3 times and check is it 4 byte character
           {
               remainingBytes = 3;
           }
         }
         else
         {
             if((val>>6)==0b10) // rotate bit 6 times and check for remainig bits these bit should be start from 10 the amount of these bits for 4 byte number is 3 for 3 byte number is 2  and so on.
             {
                remainingBytes--; 
             }
             else
             {
                 return false;
             }
            
         }
       }
       
        if(remainingBytes==0)
        {
         return true;
        }
        else
        {
            return false;
        }
    }
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }
    
    
}
