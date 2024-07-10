public class LargestSmallestInArray {
    public void findLargestAndSmalledValie(int[] numbers) {
        try {
            int largest = numbers[0];
            int smallest = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > largest) {
                    largest = numbers[i];
                } else if (numbers[i] < smallest) {
                    smallest = numbers[i];
                }
            }
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
        } catch (Exception e) {
            System.err.println(e);
            System.err.println("Largest or Smallest in Array Execution Failed");
            throw e;
        }
    }
}
