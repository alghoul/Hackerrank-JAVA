import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count;
        int counter=0;
        int sum;
        int[] array = new int[n];
        for(int i=0;i<n;i++)
        {
         array[i]=scan.nextInt();
        }

        for(int i=0;i<n;i++)
        {   
            count=0;
            sum=0;
            for(int j=i;j<n;j++)
         {   
             sum +=array[j];  
             if(sum<0)
             count++;
             
         }
           counter = counter+count; 
        }
           System.out.println(counter);   

    }
}
