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
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            list.add(scan.nextInt());
        }
        int query = scan.nextInt();
        scan.nextLine();

        for(int i=0;i<query;i++)
        {
         String task = scan.next();
            if(task.equals("Insert"))
            {
               int index = scan.nextInt();
               int replace = scan.nextInt();
               list.add(index,replace);                
            }
            if(task.equals("Delete"))
            {
               int index_x = Integer.parseInt(scan.next()); 
               list.remove(index_x); 
            }
        }
        scan.close();
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        
    }
}
