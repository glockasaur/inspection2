import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Odalys Martinez-Villa
// a program that shows off my skills

public class OdalysCode {

  public static void main(String[] args) {
    System.out.println("Hello, welcome to my program");
    // new scanner
    Scanner KeyboardInput = new Scanner(System.in);
    String Fname = JOptionPane.showInputDialog("What is your first name?");
    String Lname = JOptionPane.showInputDialog("What is your last name?");
    System.out.println("Hello " + Fname + " " +Lname + ", I will tell you how "
            + "many characters there are in your name!");
    nameLen(Fname); //this will find the amount of characters in your first name
    initials(Fname, Lname); //this will find your initials
    

    System.out.format(" %n Tell me your favorite number and I will tell %n you which is larger, the number entered, or PI"); 
    double favNum = KeyboardInput.nextDouble();
    // output the larger value, favorite number or PI
    System.out.println(Math.max(Math.PI, favNum)+ " is the bigger number");
    
    System.out.println("Enter a number to make simple array sum, where your number will be added to itself 5 times");
    // output will be input added to itself 5 times
    int arItem = KeyboardInput.nextInt();
    // try block
    try {
      simpleArraySum(arItem);
    } catch (IOException e) {
      // catch block
      e.printStackTrace();
    }
    
    System.out.println("We can also make a sum using a while loop!");
    System.out.println("Enter a number less than 50 to make a sum");
    int count = KeyboardInput.nextInt(); //initial number
    simpleWhileLoop(count); // output will be input added by one until 50
    
    System.out.println("We can also make a sum using a do-while loop that will count from 1!");
    System.out.println("Enter a number you want to count to");
    int countTo = KeyboardInput.nextInt(); //input of number
    simpleDoWhileLoop(countTo); // output will be a count up intil input number
    
    System.out.println("Let's make a staircase. How long do you want it? Enter a number");
    int N;
    N = KeyboardInput.nextInt(); //width of staircase
    staircase(N); //output will be a staircase of #
   
    Bird bird = new Bird(); //character.java file
	  bird.walk(); //output
	  bird.fly();
      bird.sing();
      
    System.out.println("Let's make another array list to locate specific numbers at a place.");
    System.out.println("Enter the number of columns there are in your array");
    System.out.println("Enter your list of numbers with spaces in between");

//The first line has an integer n 
//In each of the next n lines there will be an integer d denoting number of integers on that line 
//and then there will be d space-separated integers. 
//In the next line there will be an integer q denoting number of queries. 
//Each query will consist of two integers x and y.
        List<List<Integer>> lines = new ArrayList<List<Integer>>();
        int n = KeyboardInput.nextInt();
        for (int i = 0; i < n; i++) {
            List<Integer> line = new ArrayList<Integer>();
            int d = KeyboardInput.nextInt();
            for (int j = 0; j < d; j++) {
                line.add(KeyboardInput.nextInt());
            }
            lines.add(line);
        }
    System.out.println("Enter the number of rows there are in your array");
    System.out.println("Enter x,y values to find the specific number in the array");
        int q = KeyboardInput.nextInt();
        for (int i = 0; i < q; i++) {
            int x = KeyboardInput.nextInt();
            int y = KeyboardInput.nextInt();
            if (y > lines.get(x - 1).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(lines.get(x - 1).get(y - 1));
            }
        }

  }


  private static void nameLen(String Fname) {
// finds number of characters in first name
    String nameLen = Fname;
    int strlen = Fname.length();

    System.out.format("%n %s are %n %d characters %n in your first name! %n","There", strlen);

  }
      
  public static void initials(String Fname, String Lname) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Do you want to know what your initials are?");
    System.out.println("Type either y or n");
    String answer;
    // prompts user to enter y or n 
    answer = keyboard.nextLine();
    boolean yn;
    // this will get the first letter of the first name
    String Finitial = Fname.substring(0,1);
    // this will get the first letter of the last name
    String Linitial = Lname.substring(0,1);
    // this will concatnate the 2 first letters of the names
    String initial = Finitial + Linitial;
      OUTER:
      while (true) {
          switch (answer) {
              case "y":
              case "Y":
                  yn = true;
                  //if yes, it will give the initials
                  System.out.println("Your initials are " + initial);
                  break OUTER;
              case "n":
              case "N":
                  yn = false;
                  //if no, it will not find the initials
                  System.out.println("You probably already know your initials.");
                  break OUTER;
              default:
                  //this will prompt user to enter a y or n
                  System.out.println("Sorry, I didn't catch that. Please answer y/n");
                  // this will keep on asking for a y or n if it is not a y or n
                  answer = keyboard.nextLine();
                  break;
          }
      }
}
  public static int simpleArraySum(int arItem) throws IOException {
    //enter an int and it will be added itself 5 times
    int[] ar = new int[5];
    int sum = 0;
   
    for (int arItr = 0; arItr < ar.length; arItr++) {
    
      ar[arItr] = arItem;
      sum = sum + ar[arItr];
      System.out.println(sum);

    }
    return sum; //prints 5 lines, each will be input added itself by 5 times
}


  public static int simpleWhileLoop(int count) {
//while loop
  while (count < 50) { //input number will be added by 1 intil 50
      System.out.println("Count is: " + count);
      count++;
      
  }
  return count;
  }
  
  public static int simpleDoWhileLoop(int countTo) {
 
  //do-while loop
  int initial = 1;
  do {
      System.out.println("Count is: " + initial);
      initial++;
  } while (initial <= countTo);
  return initial; //returns the count from 1 to wished number 
  }
  
  
  private static int staircase(int N) {
      // creates a staircase of #

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(j < N-1-i){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
       return N;
    }
  
  


       
    }