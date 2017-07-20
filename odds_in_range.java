/* Hussein Al Ghoul,
   github: https://github.com/alghoul 
*/ 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution { 


    static int[] oddNumbers(int l, int r) {
        int limit1=Integer.MIN_VALUE;
        int limit2=Integer.MIN_VALUE;
        if(l%2==0)
        limit1=l+1;
        else
        limit1=l;
        if(r%2==0)
        limit2=r-1;
        else
        limit2=r;
	    int total_odds=(limit2-limit1)/2+1;
        int [] odd =new int[total_odds];

        for(int i=0;i<total_odds;i++)
        {
   
            odd[i] = 2*(i)+limit1;

        }
        return odd;
    }

 public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int[] res;
        int _l;
        _l = Integer.parseInt(in.nextLine().trim());
        
        int _r;
        _r = Integer.parseInt(in.nextLine().trim());
        
        res = oddNumbers(_l, _r);
        for(int res_i=0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }
        
        bw.close();
    }
}
