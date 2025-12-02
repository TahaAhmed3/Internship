import java.util.Scanner;

class Patterns {
    public static void main(String[] args) {
        int rows, pattern;

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n1: Pyramid");
            System.out.println("2: Inverted Pyramid");
            System.out.println("3: Hollow Square With Diagonals");
            System.out.println("0: Quit");
            System.out.print("Enter number corresonding to your choice: ");
            pattern = scanner.nextInt();
            if (pattern == 0) {
                break;
            }

            System.out.print("Enter number of rows: ");
            rows = scanner.nextInt();
            System.out.println();

            switch (pattern) {
                case 1:
                    pyramid(rows);
                    break;

                case 2:
                    invertedPyramid(rows);
                    break;

                case 3:
                    hollowSquareWithDiagonals(rows);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }


    public static void pyramid(int rows) {
        int spaces, stars;
        for (int row = 1; row <= rows; row++) {
            spaces = rows - row;
            stars = 2 * row - 1;

            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void invertedPyramid(int rows) {
        int spaces, stars;
        for (int row = 1; row <= rows; row++) {
            spaces = row - 1;
            stars = 2 * (rows - row) + 1;

            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void hollowSquareWithDiagonals(int rows) {
        for (int col = 1; col <= rows; col++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int row = 2; row < rows; row++) {
            System.out.print("* ");
            for (int col = 2; col < rows; col++) {
                if (row == col || row + col == rows + 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println("* ");
        }
        if (rows > 1) {
            for (int col = 1; col <= rows; col++) {
                System.out.print("* ");
            }
        }
        System.out.println();
    }
       
}