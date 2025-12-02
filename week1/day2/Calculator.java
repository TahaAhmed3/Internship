import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        double num1, num2, result;
        char operator;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter \'q\' in operator to quit.");

        while (true) {
            System.out.print("\nEnter operator (+, -, *, /): ");
            operator = scanner.nextLine().charAt(0);
            if (operator == 'q') {
                break;
            }

            System.out.print("Enter 1st number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter 2nd number: ");
            num2 = scanner.nextDouble();
            scanner.nextLine();

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    result = num1 / num2;
                    break;

                default:
                    System.out.println("Invalid operator.");
                    continue;
            }
            System.out.println("Result: " + result);
        }
    }
}