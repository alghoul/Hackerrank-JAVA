import java.util.Scanner;
public class Increment_Digits
{
   public static void main(String[] args) 
   {
        int na, m = 0;
        int nb;
        Scanner s = new Scanner(System.in);

        na = s.nextInt();
        int n_digits;
        int counter=0;
        int [ ] count = new int[na];
        int [] a = new int[na]; 
        for(int i =0; i<na;i++)
        {
         a[i]=s.nextInt();
        }    
        nb = s.nextInt();
        int [] b = new int[nb];       
        for(int i =0; i<nb;i++)
        {
         b[i]=s.nextInt();
        }  
        
         for(int i =0; i<na;i++)
        {
          count[i]=0;
        String str_n = String.valueOf(a[i]);
        int max_digits = str_n.length();
         for(n_digits = 0; n_digits<max_digits; n_digits++)
          {  
             while(a[i]%(int)Math.pow(10,n_digits+1) != b[i]%(int)Math.pow(10,n_digits+1) && a[i]!=b[i])
             {   
            m = a[i] + (int)Math.pow(10,n_digits);
            a[i]=m;
                count[i]++;
             }              
          }
           counter +=count[i];
        }
         System.out.println(counter);
    }
}
