import java.io.*;
import java.util.*;

public class Main {

    public static void solve(String str){
        
        
        for(int i=0; i<(1<<str.length());i++) // i<<str.length will work like power function like for 3 bit your loop will run for 8 times.
           
        {
            int count =0;
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<str.length();j++) // this loop will run for the number of bit times like if you have 3 bit then it will run for 3 times.
            {
               int b = str.length()-1-j; // let's take bth bit for example for 3rd number you have to take 1st bit.
               char ch = str.charAt(j);
               
               
               if((i&(1<<b))==0) // if bth bith is zero
               {
                   if(count ==0)
                   {
                      sb.append(ch); 
                   }
                   else
                   {
                       sb.append(count);
                       sb.append(ch);
                       count=0;
                   }
               }
               else
               {
                  count++; 
               }
            }
            if(count > 0)
            {
                sb.append(count);
            }
            System.out.println(sb);
        }
    }
    
public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solve(str);
    }
}
