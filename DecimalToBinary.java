import java.util.Scanner;

public class DecimalToBinary {

    public void convertDecimalToBinary() {
        try {
            DataBase dataBase = new DataBase();
            System.out.println("Decimal to Binary Execution Started");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the decimal number :");
            dataBase.setdecimal(sc.nextInt());
            String binary = convertDecimalToBinary(dataBase.getdecimal());
            System.out.println("Binary representation of " + dataBase.getdecimal() + ": " + binary);
            System.out.println("Execution Completed");
            System.out.println();
            System.out.println();
        } catch (Exception e) {
            System.err.println(e);
            System.err.println("DecimalToBinary Executon Failed");
            throw e;
        }
    }

    public static String convertDecimalToBinary(int decimal) {
        try {
            StringBuilder binary = new StringBuilder();
            if (decimal == 0) {
                return "0";
            }
            while (decimal > 0) {
                int remainder = decimal % 2;
                binary.insert(0, remainder);
                System.out.println("Decimal : " + decimal + " Binary : " + remainder);
                decimal = decimal / 2;
            }
            return binary.toString();
        } catch (Exception e) {
            System.err.println(e);
            System.err.println("DecimalToBinary Executon Failed");
            throw e;
        }

    }
}