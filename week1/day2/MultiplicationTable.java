import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        int num, rows;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        num = scanner.nextInt();

        System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
       
}