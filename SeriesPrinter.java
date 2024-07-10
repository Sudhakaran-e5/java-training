public class SeriesPrinter {
    public void SeriesPrinterNumber(int indexSize) {
        try {
            System.out.println();
            for (int i = 1; i <= indexSize; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println(e);
            System.err.println("Series Print Number Execution Failed");
            throw e;
        }
    }

    public void SeriesPrinterKey(String key, int indexSize) {
        try {
            System.out.println();
            for (int i = 1; i <= indexSize; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(key + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println(e);
            System.err.println("Series Print Key Execution Failed");
            throw e;
        }
    }
}
