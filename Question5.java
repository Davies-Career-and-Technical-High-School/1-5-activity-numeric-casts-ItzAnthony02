import java.util.Scanner;


class Question5 {
    public static void main(String[] args) {

        /* Write your code here */

        Scanner scan = new Scanner(System.in);
      
        System.out.println("Enter a double.");
        double userinput = scan.nextDouble();
    
        double x = userinput *10;
        double y = userinput* 100;
        
        int ones = (int)x;
        int tenths = (int)y;
        int xy = ones %10;
        int yy= tenths%10;
        System.out.println("Answer: "+ xy+", " +yy);
    }
}