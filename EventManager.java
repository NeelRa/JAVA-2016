import java.util.Scanner;
import java.util.Arrays;

public class EventManager
  
{
  
  public static void main(String[] args)
    
  {
    
    int people;
    String fill,details;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number of people");
    
    people = Integer.parseInt(scan.nextLine());
    System.out.println( "the number is  " + people);
    
    String[] report = new String[people];
    
    for (int i=0; i<people-1; i++)
    {
      
    Scanner scan2 = new Scanner(System.in);
    System.out.println("Enter your name and email address with a dash(-) seperating them");
    
    report[i] = scan.nextLine();
    if(report[i].equals("end")){break;}
    else
    {
      
      
    }
    
      
    }
    
    //System.out.println("The details of people in the event "+report);
    System.out.println(Arrays.toString(report));
    
  }
  
}