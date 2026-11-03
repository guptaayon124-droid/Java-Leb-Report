import java.util.Scanner;

public class Number_Check {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number > 0) {
            System.out.println("Positive Number");
        }
        else if (number < 0) {
            System.out.println("Negative Number");
        }
        else {
            System.out.println("Zero");
        }
    }
}