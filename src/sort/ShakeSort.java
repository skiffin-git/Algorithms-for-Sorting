package sort;

// this is an improved sorting, a little bit better than bubble sort
public class ShakeSort
{
    public static void shakeSort(int[] values)
    {
        boolean end = false;

        while (!end)
        {
            end = true;

            for (int i = 1; i < values.length; i++)
            {
                int now, next;
                now = values[i - 1];
                next = values[i];

                if (now > next)
                {
                    values[i] = now;
                    values[i - 1] = next;

                    end = false;
                }
            }

            for (int w = values.length - 1; w > 0; w--)
            {
                int now, next;
                now = values[w - 1];
                next = values[w];

                if (now > next)
                {
                    values[w] = now;
                    values[w - 1] = next;

                    end = false;
                }
            }
        }
    }
}