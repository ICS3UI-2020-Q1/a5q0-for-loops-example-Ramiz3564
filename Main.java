 import java.util.Scanner;
/**
 * For loops example
 * @author Zach Ramirez 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for input 
    Scanner input = new Scanner(System.in); 
    //create the count variable 
    int count = 1; 
    //create the while loop to count to 10 
    while(count <= 10){
      //loop action: print number to the console 
      System.out.println(count); 
      count = count + 1; 
    }  
    
    //do the same thing with a for loop   
    for(int count2 = 0; count2 < 10; count2++){  
      //loop action:print the number
      System.out.println(count2); 
    } 
    
    
    
  }
}
