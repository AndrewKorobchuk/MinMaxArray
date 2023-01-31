import java.util.Arrays;

public class MinMax {
    public static int[] minMax(int[] arr){
        int[] temp = arr.clone();
        Arrays.sort(temp);
        int[] m = new int[2];
        m[0] = temp[0];
        m[1] = temp[temp.length-1];
        return m;
    }
}
