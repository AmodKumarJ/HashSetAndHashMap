import java.util.TreeSet;

public class findMedianSortedArrays {

    static double solution(int[] a, int[] b) {
        TreeSet<Integer> sortedSet = new TreeSet<>();
        int combinedLength = a.length + b.length;
        int[] combinedArray = new int[combinedLength];
        System.arraycopy(a, 0, combinedArray, 0, a.length);
        System.arraycopy(b, 0, combinedArray, a.length, b.length);

        for (int element : combinedArray) {
            sortedSet.add(element);
        }

        int size = sortedSet.size();
        int middle = size / 2;

        if (size % 2 != 0) {
            return sortedSet.pollFirst();
        } else {
            int firstMiddle = sortedSet.pollFirst();
            int secondMiddle = 0;

            for (int i = 0; i < middle - 1; i++) {
                secondMiddle = sortedSet.pollFirst();
            }

            return (double) (firstMiddle + secondMiddle) / 2;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3};
        int[] arr2 = {2};
        System.out.println(solution(arr1, arr2));

        int[] arr3 = {1, 2};
        int[] arr4 = {3, 4};
        System.out.println(solution(arr3, arr4));
    }
}
