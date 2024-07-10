import java.util.Arrays;

public class ArraySet {
    public void findIntersection(int result[], int firstArrayInput[], int seconsArrayInput []) {
        
        for (int i = 0; i < firstArrayInput.length; i++) {
            result[i] = firstArrayInput[i];
        }
        for (int i = 0; i < seconsArrayInput.length; i++) {
            result[firstArrayInput.length + i] = seconsArrayInput[i];
        }
        System.out.println(" A U B " + Arrays.toString(result));

    }

    public void findUnion(int result[], int firstArrayInput[], int seconsArrayInput []) {

        for (int i = 0; i < firstArrayInput.length; i++) {
            for (int j = 0; j < seconsArrayInput.length; j++) {
                if (firstArrayInput[i] == seconsArrayInput[j]) {
                    result[j] = seconsArrayInput[j];
                }
            }
        }
        System.out.println(" A n B " + Arrays.toString(result));

    }

}