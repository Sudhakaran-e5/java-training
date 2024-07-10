public class PrimeNumbersInArray {

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public void FindPrimeNumbersInArray(int[] numbers, int arrayLength) {
        System.out.print("Prime numbers in the array:");
        try {
            for (int n : numbers) {
                boolean flag = true;
                if (n <= 1) {
                    flag = false;
                }
                logic: for (int i = 2; i <= n / 2; i++) {
                    if (n % i == 0) {
                        flag = false;
                        break logic;
                    }
                    if (flag) {
                        System.out.print(n + ", ");
                    }
                }
            }
        } catch (Exception e) {
            System.err.println(e);
            System.err.println("Primen Numbr in Array Execution Failed");
            throw e;
        }
    }
}
