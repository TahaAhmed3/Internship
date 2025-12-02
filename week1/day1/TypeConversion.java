
class TypeConversion {
    public static void main(String[] args) {
        int integerValue;
        short shortValue;
        double doubleValue;
        char characterValue;

        System.out.println("Implicit Casting: ");
        integerValue = 10;
        doubleValue = integerValue;
        System.out.println("Integer Value: " + integerValue);
        System.out.println("Double Value: " + doubleValue);

        characterValue = 'A';
        integerValue = characterValue;
        System.out.println("\nCharacter Value: " + characterValue);
        System.out.println("Integer Value: " + integerValue);

        System.out.println("\nExplicit Casting: ");
        doubleValue = 19.99;
        integerValue = (int)doubleValue;
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Integer Value: " + integerValue);

        integerValue = 66;
        characterValue = (char)integerValue;
        System.out.println("\nInteger Value: " + integerValue);
        System.out.println("Character Value: " + characterValue);

        integerValue = 65535;
        shortValue = (short)(integerValue);
        System.out.println("\nInteger Value: " + integerValue);
        System.out.println("Short Value: " + shortValue);

    }
}