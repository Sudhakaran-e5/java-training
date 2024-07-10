import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try {
            main: while (true) {
                System.out.println("");
                System.out.println("Execution Started ");
                // Day 1
                System.out.println("Press 1 for Armstrong Number ");
                System.out.println("Press 2 for Decimal To Binary ");
                // Day 3
                System.out.println("Press 3 for Largest and Smallest in an Array ");
                System.out.println("Press 4 for Prime Number in an Array ");
                System.out.println("Press 5 for Print Serease of Number");
                System.out.println("Press 6 for Print Serease of Key");
                System.out.println("Press 7 for Matrix Addition ");
                System.out.println("Press 8 for Remove Duplicate In An Array ");
                System.out.println("Press 9 for Swapping of Two Numbers ");
                System.out.println("Press 10 for Swapping of Two String ");
               // System.out.println("Press 11 for Intersection in 2 Array ");
                //System.out.println("Press 12 for Swapping of Two String ");
                System.out.println("Press Any key to stop ");

                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();
                int[] numbers;
                int arrayLength;

                switch (input) {
                    case "1":
                        ArmstrongNumbers armstrongNumbers = new ArmstrongNumbers();
                        System.out.print("Enter the Stop Count : ");
                        armstrongNumbers.checkIsArmstringNumber(sc.nextInt());
                        break;
                    case "2":
                        DecimalToBinary decimalToBinary = new DecimalToBinary();
                        decimalToBinary.convertDecimalToBinary();
                        break;
                    case "3":
                        LargestSmallestInArray largestSmallestInArray = new LargestSmallestInArray();
                        System.out.println("Enter the number of data to be stored in the array");
                        arrayLength = sc.nextInt();
                        numbers = new int[arrayLength];
                        for (int i = 0; i < arrayLength; i++) {
                            System.out.print("Enter a numbers : ");
                            numbers[i] = sc.nextInt();
                        }
                        largestSmallestInArray.findLargestAndSmalledValie(numbers);
                        break;
                    case "4":
                        System.out.println("Enter the number of data to be stored in the array");
                        arrayLength = sc.nextInt();
                        numbers = new int[arrayLength];
                        for (int i = 0; i < arrayLength; i++) {
                            System.out.print("Enter a numbers : ");
                            numbers[i] = sc.nextInt();
                        }
                        PrimeNumbersInArray primeNumbers = new PrimeNumbersInArray();
                        primeNumbers.FindPrimeNumbersInArray(numbers, arrayLength);
                        break;
                    case "5":
                        System.out.println("Enter the number of data to be stored in the array");
                        arrayLength = sc.nextInt();
                        SeriesPrinter seriesPrinterNumber = new SeriesPrinter();
                        seriesPrinterNumber.SeriesPrinterNumber(arrayLength);
                        break;
                    case "6":
                        System.out.println("Enter the number of data to be stored in the array");
                        arrayLength = sc.nextInt();
                        System.out.println("Enter the Key to be Printed in Series");
                        Scanner scNew = new Scanner(System.in);
                        String key = scNew.nextLine();
                        scNew.close();
                        SeriesPrinter seriesPrinterKey = new SeriesPrinter();
                        seriesPrinterKey.SeriesPrinterKey(key, arrayLength);
                        break;
                    case "7":
                        MatrixAddition matrixAddition = new MatrixAddition();
                        matrixAddition.matrixAdditionFunction();
                        break;
                    case "8":
                        RemoveDuplicateInAnArray removeDuplicateInAnArray = new RemoveDuplicateInAnArray();
                        System.out.println("Enter the number of data to be stored in the array");
                        arrayLength = sc.nextInt();
                        numbers = new int[arrayLength];
                        for (int i = 0; i < arrayLength; i++) {
                            System.out.print("Enter a numbers : ");
                            numbers[i] = sc.nextInt();
                        }
                        removeDuplicateInAnArray.removeDuplicates(numbers);
                        break;
                    case "9":
                        SwapValues swapNumber = new SwapValues();
                        System.out.print("Enter the first number value : ");
                        int firstNumber = sc.nextInt();
                        System.out.print("Enter the second number value : ");
                        int secondNumber = sc.nextInt();
                        swapNumber.swappingOfNumbers(firstNumber, secondNumber);
                        break;
                    case "10":
                        SwapValues swapValues = new SwapValues();
                        System.out.print("Enter the first number value : ");
                        String firstValue = sc.nextLine();
                        System.out.print("Enter the second number value : ");
                        String secondValue = sc.nextLine();
                        swapValues.swappingOfValue(firstValue, secondValue);
                        break;
                    case "11":{
                        ArraySet arraySet = new ArraySet();
                        System.out.println("Enter the number of data to be stored in the array");
                        arrayLength = sc.nextInt();
                        int[] firstArrayInput = new int[arrayLength];
                        int[] seconsArrayInput = new int[arrayLength];
                        System.out.print("Set the valu for the first array");
                        for (int i = 0; i < arrayLength; i++) {
                            System.out.print("Enter a numbers for : ");
                            firstArrayInput[i] = sc.nextInt();
                        }
                        System.out.print("Set the valu for the Second array");
                        for (int i = 0; i < arrayLength; i++) {
                            System.out.print("Enter a numbers : ");
                            seconsArrayInput[i] = sc.nextInt();
                        }
                        int result[] = new int[arrayLength];

                        arraySet.findIntersection(result, firstArrayInput, seconsArrayInput);
                        break;
                    }
                        case "12":{
                        ArraySet arraySet = new ArraySet();
                        System.out.println("Enter the number of data to be stored in the array");
                        arrayLength = sc.nextInt();
                        int[] firstArrayInput = new int[arrayLength];
                        int[] seconsArrayInput = new int[arrayLength];
                        System.out.print("Set the valu for the first array");
                        for (int i = 0; i < arrayLength; i++) {
                            System.out.print("Enter a numbers for : ");
                            firstArrayInput[i] = sc.nextInt();
                        }
                        System.out.print("Set the valu for the Second array");
                        for (int i = 0; i < arrayLength; i++) {
                            System.out.print("Enter a numbers : ");
                            seconsArrayInput[i] = sc.nextInt();
                        }
                        int result[] = new int[arrayLength];

                        arraySet.findUnion(result, firstArrayInput, seconsArrayInput);
                        break;
                    }
                        MatrixAddition matrixAddition= new MatrixAddition();
                        matrixAddition.matrixAdditionFunction();
                        break;

                    default:
                        System.out.println("Execution Stopped");
                        break main;
                }
            }
        } catch (Exception e) {
            System.err.println(e);
            System.err.println("Execution Failed");
            throw e;
        }
    }
}