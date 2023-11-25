import java.util.Scanner;
import java.util.ArrayList;
public class ArrayStack
{
    public int size;
    int top;
    public int stk[] = new int[size];

    public ArrayStack(int size, int[] arr)
    {
        super();
        this.size = size;
        this.stk = arr;
        top = -1;
    }

    public int getSize()
    {
        return size;
    }

    public int[] getStk()
    {
        return stk;
    }

    public void push(int n)
    {
        if (isFull() == true)
        {
            System.out.println("Stack is Full");
        } else
        {
            top++;
            stk[top] = n;
        }
    }

    public void pop()
    {
        if (isEmpty() == true)
        {
            System.out.println("Stack is Empty...");
        }
        else
        {
            System.out.println("Stack top value Deleted " + stk[top]);
            stk[top] = 0;
            top--;
        }
    }

    public void display()
    {
        if (isEmpty() == true)
        {
            System.out.println("Stack is Empty...");
        }
        else
        {
            for (int j = 0; j <= top; j++)
            {
                System.out.print(stk[j] + ",");
            }

            System.out.println();
        }
    }

    public boolean isFull()
    {
        if (top >= getSize() - 1)
            return true;
        else
            return false;
    }

    public boolean isEmpty()
    {
        if (top <= -1)
            return true;
        else
            return false;
    }

    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter `Stack Size");
        int StackSize = sc.nextInt();
        int Stk[] = new int[StackSize];
        ArrayStack op = new ArrayStack(StackSize, Stk);
        boolean x = true;


        while (x)
        {
            System.out.println("Chose Yor Options \n " +
                    "1-->Add Value in Stack \n" + " 2--> Delete Value in Stack \n " +
                    "3--> Display Value in Stack\n " + "4 --> End Program\n");
            int chose = sc.nextInt();


            switch (chose)
            {
                case 1:
                    System.out.println("Enter Your Stack Value");
                    int selection = sc.nextInt();
                    op.push(selection);
                    break;
                case 2:
                    op.pop();
                    break;
                case 3:
                    op.display();
                    break;
                case 4:
                    System.out.flush();
            }
        }
    }
}
