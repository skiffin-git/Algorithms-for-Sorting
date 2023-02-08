package sort;

// Unstable sorting algorithm
// Takes O(n²) time (actually O(n² / 2), but we round that to O(n²))

public class InsertionSort
{
    public static void sort(int[] array)
    {
        for (int i = array.length - 1; i >= 0; i--)
        {
            findMaxAndSwap(array, i);
        }
    }

    private static void findMaxAndSwap(int[] array, int bound)
    {
        int max = array[0];
        int maxIndex = 0;

        for (int i = 0; i <= bound; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
                maxIndex = i;
            }
        }

        int temp = array[bound];

        array[bound] = max;
        array[maxIndex] = temp;
    }
}