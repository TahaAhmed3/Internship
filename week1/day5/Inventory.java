import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private final HashMap<String, Integer> inventory = new HashMap<>();
    

    public void addItem(String item, int quantity) throws InventoryException.DuplicateItemException {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative: " + quantity);
        }
        else if (inventory.containsKey(item)) {
            throw new InventoryException.DuplicateItemException();
        }
        inventory.put(item, quantity);
    }


    public void removeItem(String item) {
        inventory.remove(item);
    }


    public void updateQuantity(String item, int quantity) throws InventoryException.ItemNotFoundException {
        if (!inventory.containsKey(item)) {
            throw new InventoryException.ItemNotFoundException();
        }
        inventory.put(item, quantity);
    }


    public int getQuantity(String item) throws InventoryException.ItemNotFoundException {
        if (!inventory.containsKey(item)) {
            throw new InventoryException.ItemNotFoundException();
        }
        return inventory.get(item);
    }


    public void display() {
        int i = 1;
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(i + ". " + entry.getKey() + ": " + entry.getValue());
            i++;
        }
    }

}