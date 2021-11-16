import java.util.LinkedList;
import java.util.List;

public class Program {

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        List<Integer[]> result = new LinkedList<>();
        if (array.length < 4) {
            return result;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    for (int l = k + 1; l < array.length; l++) {
                        int sum = array[i] + array[j] + array[k] + array[l];
                        if (sum == targetSum) {
                            result.add(new Integer[]{ array[i], array[j], array[k], array[l] });
                        }
                    }
                }
            }
        }
        return result;
    }

}
