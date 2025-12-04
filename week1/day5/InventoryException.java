
public class InventoryException extends RuntimeException {
    public InventoryException() {
        super();
    }

    public InventoryException(String message) {
        super(message);
    }


    public static class ItemNotFoundException extends InventoryException {
        public ItemNotFoundException() {
            super();
        }

        public ItemNotFoundException(String message) {
            super(message);
        }
    }


    public static class DuplicateItemException extends InventoryException {
        public DuplicateItemException() {
            super();
        }

        public DuplicateItemException(String message) {
            super(message);
        }
    }
    
}