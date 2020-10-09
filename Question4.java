import java.util.Scanner;

class Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Write your code here */
        System.out.println("Please enter a decimal.");
        double num1 = scan.nextDouble();
        double output = num1 + 0.5;
        System.out.println("Answer: " + (int)(output));

    }
}