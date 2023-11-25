public class Que03
{
    public static void main(String[] args)
    {
        int[] arr = {5, 2, 9, 1, 5};
        int sum = 0;

        for (int num : arr)
        {
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
