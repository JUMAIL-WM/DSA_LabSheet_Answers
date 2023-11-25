public class Que09
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Odd numbers in the array:");

        for (int num : array)
        {
            if (num % 2 != 0)
            {
                System.out.println(num);
            }
        }
    }
}
