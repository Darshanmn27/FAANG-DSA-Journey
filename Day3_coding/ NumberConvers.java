import java.util.*;
public class NumberConvers
{

    // ✅ 4. Binary to Decimal Conversion

    // ✅ Method 1: Using Built-in Function
    public static void binaryToDecimalUsingBuiltIn(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal (Built-in): " + decimal);
    }

    // ✅ Method 2: Manual Conversion (Logic)
    public static void binaryToDecimalManual(String binary) {
        int decimal = 0;
        int power = 0;
        
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        System.out.println("Decimal (Manual): " + decimal);
    }

    // ✅ Time Complexity: O(N)
    // ✅ Space Complexity: O(1)
    

    // ✅ 5. Octal to Decimal Conversion

    // ✅ Method 1: Using Built-in Function
    public static void octalToDecimalUsingBuiltIn(String octal) {
        int decimal = Integer.parseInt(octal, 8);
        System.out.println("Decimal (Built-in): " + decimal);
    }

    // ✅ Method 2: Manual Conversion (Logic)
    public static void octalToDecimalManual(String octal) {
        int decimal = 0;
        int power = 0;
        
        for (int i = octal.length() - 1; i >= 0; i--) {
            decimal += (octal.charAt(i) - '0') * Math.pow(8, power);
            power++;
        }
        System.out.println("Decimal (Manual): " + decimal);
    }

    // ✅ Time Complexity: O(N)
    // ✅ Space Complexity: O(1)


    // ✅ 6. Hexadecimal to Decimal Conversion

    // ✅ Method 1: Using Built-in Function
    public static void hexadecimalToDecimalUsingBuiltIn(String hex) {
        int decimal = Integer.parseInt(hex, 16);
        System.out.println("Decimal (Built-in): " + decimal);
    }

    // ✅ Method 2: Manual Conversion (Logic)
    public static void hexadecimalToDecimalManual(String hex) {
        int decimal = 0;
        int power = 0;
        
        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);
            int value;
            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else {
                value = ch - 'A' + 10;
            }
            decimal += value * Math.pow(16, power);
            power++;
        }
        System.out.println("Decimal (Manual): " + decimal);
    }

    // ✅ Time Complexity: O(N)
    // ✅ Space Complexity: O(1)


    // ✅ MAIN METHOD TO RUN ALL
    public static void main(String[] args) {
        // Binary to Decimal
        System.out.println("----- Binary to Decimal -----");
        binaryToDecimalUsingBuiltIn("1111");
        binaryToDecimalManual("1111");

        System.out.println();

        // Octal to Decimal
        System.out.println("----- Octal to Decimal -----");
        octalToDecimalUsingBuiltIn("17");
        octalToDecimalManual("17");

        System.out.println();

        // Hexadecimal to Decimal
        System.out.println("----- Hexadecimal to Decimal -----");
        hexadecimalToDecimalUsingBuiltIn("F");
        hexadecimalToDecimalManual("F");
    }
}
