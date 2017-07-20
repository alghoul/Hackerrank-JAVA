//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh) throws Exception
   {
      BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
      int n= Integer.valueOf(buffer.readLine());
      HashMap<String , Integer> hashmap = new HashMap<>();
      for(int i=0;i<n;i++)
      {
         String name = buffer.readLine();
         int phone = Integer.valueOf(buffer.readLine());
         hashmap.put(name, phone);
      }
      String s;             
      while((s = buffer.readLine()) != null)
      {

         if(hashmap.containsKey(s))
         {
           System.out.println(s+ "=" + hashmap.get(s));
         }    
        else
        {
           System.out.println("Not found"); 
        }             
             
     }
                   buffer.close();
   }
}
