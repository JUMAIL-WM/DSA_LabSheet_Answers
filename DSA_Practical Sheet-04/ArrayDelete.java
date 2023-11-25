import java.util.Scanner;
public class ArrayDelete
{
    public int size;
    int i=0;
    public int arr[]=new int[size];
    public ArrayDelete(int size, int[] arr)
    {
        super();
        this.size = size;
        this.arr = arr;
    }
    public int getSize()
    {
        return size;
    }
    public int[] getArr()
    {
        return arr;
    }
    public void addArray(int n)
    {if(i>=getSize())
    {
        System.out.println("Array is Full");
    }
    else
    {
        arr[i]=n;
        i++;
    }
    }

    public void DeleteArrayValue()
    {
        if(i<=0)
        {
            System.out.println("Array is Empty...");
        }
        else
        {
            i--;
            arr[i]=0;
        }
    }
    public void displyaArrayValue()
    {
        if(i<=0)
        {
            System.out.println("Array is Empty...");
        }
        else
        {
            for(int j=i-1;j>=0;j--)
            {
                System.out.print(arr[j]+",");
            }
            System.out.println();
        }
    }
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size");

        int ArraySize=sc.nextInt();
        int Arr[]=new int[ArraySize];

        ArrayDelete op=new ArrayDelete(ArraySize,Arr);
        boolean x=true;

        while(x)
        {
            System.out.println("Chose Yor Options " +
                    "\n 1-->Add Value in Array \n " +
                    "2--> Delete Value in Array \n " +
                    "3--> Display Value in Array \n 10 --> End Program\n");
            int chose=sc.nextInt();
            switch(chose)
            {
                case 1:System.out.println("Enter Your Value");int selection=sc.nextInt();op.addArray(selection);break;
                case 2:op.DeleteArrayValue();break;
                case 3:op.displyaArrayValue();
            }
            System.out.flush();
        }
    }
}

