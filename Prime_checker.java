import static java.lang.System.in;

class Prime{
    public void checkPrime(int... args)
    {
      String output="";  
      for(int i : args)
      {
          if(isaPrime(i))
          {
              output += i+" ";
          }

      }

      System.out.println(output);
    }
    boolean isaPrime(int value)
    {
        boolean check = true;
        if(value<2)
           check = false;
        for(int i=2;i < (value/2)+1 ; i++)
        {
            if(value%i == 0)
                check=false;
        }
        return check;
    }
}
