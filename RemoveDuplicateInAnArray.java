import java.util.Arrays;

public class RemoveDuplicateInAnArray {
    public void removeDuplicates(int[] array) {
        int[] result = new int[array.length];
        if (array.length == 0 || array.length == 1) {
            result = array;
        }
        int[] temp = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (array[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j++] = array[i];
            }
        }
        result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
