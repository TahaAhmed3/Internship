import java.util.InputMismatchException;
import java.util.Scanner;

public class TestInventory {
    public static void main(String[] args) {
        int choice, quantity;
        String item;
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1: Add Item");
            System.out.println("2: Remove Item");
            System.out.println("3: Update Quantity");
            System.out.println("4: Get Quantity");
            System.out.println("5: Display Inventory");
            System.out.println("0: Quit");
            System.out.print("Enter number corresonding to your choice: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 0) {
                    break;
                }

                switch (choice) {
                    case 1:
                        System.out.print("Enter item name: ");
                        item = scanner.nextLine();
                        System.out.print("Enter quantity: ");
                        quantity = scanner.nextInt();
                        inventory.addItem(item, quantity);
                        break;

                    case 2:
                        System.out.print("Enter item name: ");
                        item = scanner.nextLine();
                        inventory.removeItem(item);
                        break;

                    case 3:
                        System.out.print("Enter item name: ");
                        item = scanner.nextLine();
                        System.out.print("Enter quantity: ");
                        quantity = scanner.nextInt();
                        inventory.updateQuantity(item, quantity);
                        break;

                    case 4:
                        System.out.print("Enter item name: ");
                        item = scanner.nextLine();
                        System.out.println("Quantity: " + inventory.getQuantity(item));
                        break;

                    case 5:
                        System.out.println();
                        inventory.display();
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                scanner.nextLine();
            }
            catch (InventoryException.ItemNotFoundException e) {
                System.out.println("Item not found.");
            }
            catch (InventoryException.DuplicateItemException e) {
                System.out.println("Duplicate item.");
            }
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    
}