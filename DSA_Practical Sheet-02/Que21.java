public class Que21
{
    public static void main(String[] args)
    {
        int[] arr = {2, 7, 12, 17, 21, 29, 31, 42};

        System.out.println("Prime numbers in the array:");

        for (int num : arr)
        {
            if (isPrime(num))
            {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.println("Non-prime numbers in the array:");

        for (int num : arr)
        {
            if (!isPrime(num))
            {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int num)
    {
        if (num <= 1)
        {
            return false;
        }
        if (num <= 3)
        {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0)
        {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6)
        {
            if (num % i == 0 || num % (i + 2) == 0)
            {
                return false;
            }
        }
        return true;
    }
}
