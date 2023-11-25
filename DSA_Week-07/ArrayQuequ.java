import java.util.Scanner;
public class ArrayQuequ
{
    public int size;
    int front,rear;
    public int que[]=new int[size];
    public ArrayQuequ(int size, int[] arr)
    {
        super();
        this.size = size;
        this.que = arr;
        front=-1;
        rear=-1;
    }
    public int getSize()
    {
        return size;
    }
    public int[] getQue()
    {
        return que;
    }
    public void add(int n)
    {
        if(isFull()==true)
        {
            System.out.println("Queuse is Full");
        }
        else
        {
            front++;
            que[front]=n;
        }
    }
    public void delet()
    {
        if(isEmpty()==true)
        {
            System.out.println("Queuse is Empty...");
        }
        else
        {
            rear++;
            System.out.println("Queuse first value Deleted "+que[rear]);
            que[rear]=0;
        }
    }
    public void display()
    {
        if(isEmpty()==true)
        {
            System.out.println("Quequ is Empty...");
        }
        else
        {
            for(int j=rear+1;j<=front;j++)
            {
                System.out.print(que[j]+",");
            }
            System.out.println();
        }
    }
    public boolean isFull()
    {
        if(front>=getSize()-1)
            return true;
        else
            return false;
    }
    public boolean isEmpty()
    {
        if(front==rear){
            return true;
        }
        else
            return false;
    }
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Quequ Size");
        int ArraySize=sc.nextInt();
        int Arr[]=new int[ArraySize];
        ArrayQuequ op=new ArrayQuequ(ArraySize,Arr);
        boolean x=true;

        while(x)
        {
            System.out.println("Chose Yor Options \n "
                    + "1-->Add Value in Quequ \n"
                    + " 2--> Delete Value in Quequ \n "
                    + "3--> Display Value in Quequ \n "
                    + "4 --> End Program\n");
            int chose=sc.nextInt();
            switch(chose)
            {case 1:System.out.println("Enter Your Quequ Value");
                int selection=sc.nextInt();
                op.add(selection);break;
                case 2:op.delet();break;
                case 3:op.display();break;
                case 4:System.out.flush();}
        }
    }
}
