package sort;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();

        int[] array = IntStream.iterate(random.nextInt(1000), i -> i + 5)
                .limit(1000)
                .toArray();

        ShakeSort.shakeSort(array);

        System.out.println(Arrays.toString(array));
    }
}