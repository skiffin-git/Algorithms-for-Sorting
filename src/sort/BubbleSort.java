package sort;

// Stable sorting algorithm
// Takes O(n²) time (actually O(n² / 2), but we round that to O(n²))

public class BubbleSort
{
    public static void sort(int[] array)
    {
        for (int i = array.length - 1; i >= 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (array[j] > array[j + 1])
                    swap(array, j, j + 1);
            }
        }
    }

    private static void swap(int[] array, int i, int j)
    {
        int temp = array[i];

        array[i] = array[j];
        array[j] = temp;
    }
}