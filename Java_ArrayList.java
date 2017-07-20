import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList[] arraylist = new ArrayList[n];  
        for(int i=0;i<n;i++)
        {
        int d = scan.nextInt();
        arraylist[i]= new ArrayList();   
            for(int j=0;j<d;j++)
            {
                arraylist[i].add(scan.nextInt());
            }
        }
        int m =scan.nextInt();
        int[] query = new int[2]; 

        for(int j=0;j<m;j++)
        {
        query[0]=scan.nextInt();
        query[1]=scan.nextInt(); 
         if((query[1]-1)<arraylist[query[0]-1].size())
             System.out.println(arraylist[query[0]-1].get(query[1]-1));
         else
             System.out.println("ERROR!");
        }
        
        
    }
}
