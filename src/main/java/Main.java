public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] minMax = MinMax.minMax(arr);
        System.out.println("Min: " + minMax[0] + "; Max: " + minMax[1]);
    }
}
