import java.util.*;
/**
 * Write a description of class Classwork2Spring here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Classwork2Spring
{
   public static void main(String[] args)
   {
       ArrayList<String> sports = new ArrayList<String>();
       sports.add("Softball");
       sports.add("Soccer");
       sports.add("Basketball");
       sports.add("Tennis");
       sports.add("Soccer");
       sports.add("Skiing");
       sports.add("Rowing");
       
       
       printElements(sports);
       insertElements(sports, "Football");
       printElements(sports);
       System.out.print(returnElements(sports, 3));
       removeThirdElement(sports);
       System.out.print(searchForElement(sports, "Soccer"));
       System.out.print(searchAndCountElement(sports,"Soccer"));
       printElements(copyAndReturnList(sports));
       shuffleElements(sports);
       reverseElements(sports);
    }
    
   public static void printElements(ArrayList<String> inList)
   {
       for(int i = 0; i<inList.size();i++)
            System.out.println(inList.get(i));
   }
   
   public static void insertElements(ArrayList<String> inList, String a)
   {
       inList.add(0,a);
    }
    
   public static String returnElements(ArrayList<String> inList, int i)
   {
       return inList.get(i);
    }
    
   public static void removeThirdElement(ArrayList<String> inList)
   {
       inList.remove(2);
       for(int i = 0; i<inList.size();i++)
            System.out.println(inList.get(i));
    }
   
   public static int searchForElement(ArrayList<String> inList, String a)
   {
       return inList.indexOf(a);
    }
    
   public static int searchAndCountElement(ArrayList<String> inList, String a)
   {
       int count = 0;
       for(int i = 0; i<inList.size(); i++)
       {    if(inList.get(i).equals(a))
                count++;
       }
       return count;
   }
   
   public static ArrayList<String> copyAndReturnList(ArrayList<String> inList)
   {
       ArrayList<String> copy = new ArrayList<String>();
       for(int i = 0; i<inList.size(); i++)
       {
           copy.add(inList.get(i));
       }
       return copy;
    }
   
   public static void shuffleElements(ArrayList<String> inList)
   {
      Collections.shuffle(inList);
      for(int i = 0; i<inList.size();i++)
            System.out.println(inList.get(i));
   }
  
   public static void reverseElements(ArrayList<String> inList)
   {
       ArrayList<String> reverse = new ArrayList<String>();
       for(int i = inList.size()-1; i>=0; i--)
           reverse.add(inList.get(i));
           
       for(int i = 0; i<reverse.size();i++)
            System.out.println(reverse.get(i));
    }
}
