import java.util.Scanner;


class Question3 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

        /* Write your code here */
        System.out.println("Enter two integers");
        int Numx = scan.nextInt();
        int Numy = scan.nextInt();
        double x = 1.0*((double)(Numx+Numy)/2);
        
        
        System.out.println("Avg. of the numbers");
        System.out.println(x);
     
    }
}