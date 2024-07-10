public class SwapValues {
    public void swappingOfNumbers(int firstNumber, int secondNumber) {
        try {
            System.out.println("Input : firstNumber: " + firstNumber + " secondNumber: " + secondNumber);
            System.out.println();
            firstNumber = firstNumber + secondNumber;
            secondNumber = firstNumber - secondNumber;
            firstNumber= firstNumber - secondNumber;
            System.out.println();
            System.out.println("output : firstNumber: " + firstNumber + " secondNumber: " + secondNumber);
        } catch (Exception e) {
            System.err.println(e);
            System.err.println("Swap Value Execution Failed");
        }
    }
    public void swappingOfValue(String firstValue, String secondValue) {
        try {
        System.out.println("Before swapping: firstValue = " + firstValue + ", secondValue = " + secondValue);
        System.out.println();
        firstValue = firstValue + secondValue;
        secondValue = firstValue.substring(0, firstValue.length() - secondValue.length()); 
        firstValue = firstValue.substring(secondValue.length());
        System.out.println();
        System.out.println("After swapping: firstValue = " + firstValue + ", secondValue = " + secondValue);
        } catch (Exception e) {
            System.err.println(e);
            System.err.println("Swap Value Execution Failed");
        }
    }
}