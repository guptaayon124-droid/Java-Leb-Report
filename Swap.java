import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, temp;

        System.out.print("Enter first number: ");
        a = input.nextInt();

        System.out.print("Enter second number: ");
        b = input.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}