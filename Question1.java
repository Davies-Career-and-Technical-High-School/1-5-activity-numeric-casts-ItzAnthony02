import java.util.Scanner;

class Question1 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
         //Write your code here 
      System.out.println("Please enter a two digit number.");
      int digit = scan.nextInt();

      int fdigit = digit%10;
      int sdigit = digit / 10;

      System.out.println("Here are the two digits:");
      System.out.println(fdigit);
      System.out.print(sdigit);
      int number = scan.nextInt(); 
      
    
    }
}