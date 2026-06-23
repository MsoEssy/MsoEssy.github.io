import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("Choose Operation");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        int choice = input.nextInt();

        switch(choice) {

            case 1:
                System.out.println("Answer = " + (num1 + num2));
                break;

            case 2:
                System.out.println("Answer = " + (num1 - num2));
                break;

            case 3:
                System.out.println("Answer = " + (num1 * num2));
                break;

            case 4:
                System.out.println("Answer = " + (num1 / num2));
                break;

            default:
                System.out.println("Invalid choice");
        }

        input.close();
    }
}
