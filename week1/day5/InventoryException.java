
public class InventoryException extends Exception {

    public static class ItemNotFoundException extends InventoryException {}

    public static class DuplicateItemException extends InventoryException {}
}