import java.util.Arrays;


// O(NlogN)
public class MergeSort {
    public static void main(String[] args) {
        int[] values = {7, 2, 0, 1, 7, 4, 9, 10, -5};

        mergeSort(values);

        System.out.println(Arrays.toString(values));
    }

    private static void mergeSort(int[] values) {
        if (values.length > 1) {
            int[] firstHalf = new int[values.length / 2];
            System.arraycopy(values, 0, firstHalf, 0, values.length / 2);
            mergeSort(firstHalf);

            int secondHalfLength = values.length - values.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(values, values.length / 2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

            merge(firstHalf, secondHalf, values);
        }
    }

    private static void merge(int[] list1, int[] list2, int[] temp) {
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;

        while (i1 < list1.length && i2 < list2.length) {
            if (list1[i1] < list2[i2]) {
                temp[i3++] = list1[i1++];
            } else {
                temp[i3++] = list2[i2++];
            }
        }

        while (i1 < list1.length) {
            temp[i3++] = list1[i1++];
        }

        while (i2 < list2.length) {
            temp[i3++] = list2[i2++];
        }
    }
}