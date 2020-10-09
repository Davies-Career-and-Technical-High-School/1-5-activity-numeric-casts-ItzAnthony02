import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        /* Write your code here */
      System.out.println("Please enter a three digit number.");

      int digit = scan.nextInt();

      int x = digit/100;
      int y = digit/ 10;
      int z = y%10;
      int xy = digit%10;
      System.out.println("Here are the three digits:");
      System.out.println(xy);
      System.out.println(z);
      System.out.print(x);

      
    }
}