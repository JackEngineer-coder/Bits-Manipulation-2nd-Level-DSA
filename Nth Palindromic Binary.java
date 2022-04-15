import java.io.*;
import java.util.*;

public class Main {
    
    public static int getReverse(int n)
    {
        int rev=0;
        while(n !=0)
        {
            int lb = (n & 1); // set lowest bit.
            
            rev |= lb; // set reverse bit 
            
            rev <<=1; // shifted rev by 1
            n >>=1; // shifted n by 1 in opposite direction
            
            
        }
        rev >>=1; // we have shifted rev one extra time that's why we have to shift it by one time from outside of while loop.
        return rev;
    }

    public static int NthPalindromicBinary(int n) {
        int count =1;
        int len =1;
        while(count < n)
        {
            len++;
            int ForCount = (1<<(len-1)/2);
            count += ForCount; 
        }
        
        count -= (1<<(len-1)/2); // we need length of the group in which palindrom lies. like for 29 it should be 8 and for 22 it should be 7
        int offset = n-count-1; // in this we are calculating the distance between given element and 1st element of that particular palindrom . for example 29 comes under 23 - 30 group of palindrom. and value of offset for this is 29-23 =6;
        
        int ans = (1<<(len-1)); // create binary number like 10000000 for 29 because it belongs to 8 group of palindrom.
        
        ans |= (offset<<(len/2)); // shift offset value by len /2 times like for 29 110 will be shift by 4 times and will become 1100000 and then we will perform or operation with ans. ans is 10000000.
        
        int ValFR =(ans>>(len/2)); // value for reverse now we have 11100000 in ans after OR operation now we will make shift in this number in the opposite side and then we will have 00001110
        
        int rev = getReverse(ValFR); // this function will provide 00000111 means opposite of ValFR.
        
        ans |= rev; // and in the last we will make or between ans and rev that is 11100111
        
        return ans;
        
        
        
        
        
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(NthPalindromicBinary(n));
    }

}
