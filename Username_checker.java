         String regex = "<(.+)>([^<>]+)</\\1>";
          Pattern pattern = Pattern.compile(regex);
          Matcher match = pattern.matcher(line);
          int counter = 0;
          while(match.find())
          {
              if(match.group(2).length() !=0)
              {
                  System.out.println(match.group(2));
                  counter++;
              }
          }
          if(counter ==0)
          {
              System.out.println("None");
          }
