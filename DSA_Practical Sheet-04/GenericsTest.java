public class GenericsTest
{
    public static void main(String chinthaka[])
    {
        List<Integer> inlist=new List<>();
        System.out.printf("size of the list: %d%n",inlist.size());
        System.out.printf("list is empty: %s%n",inlist.isEmpty());
        System.out.println("insert front 5 in the list");
        inlist.addFront(4);
        System.out.printf("size of the list: %d%n",inlist.size());
        System.out.println("list now");
        inlist.printData();
        System.out.println("");
        System.out.println("insert front 10 in the list");
        inlist.addFront(10);
        System.out.printf("size of the list: %d%n",inlist.size());
        System.out.println("list now");
        inlist.printData();
        System.out.println("");
    }
}