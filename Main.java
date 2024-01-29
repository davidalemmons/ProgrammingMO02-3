public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(BinaryConverter.bin2Dec("1101")); // Correct binary string
            System.out.println(BinaryConverter.bin2Dec("11012")); // Incorrect binary string
        } catch (BinaryFormatException e) {
            System.err.println(e.getMessage());
        }
    }
}
