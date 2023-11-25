import java.util.Stack;
public class Array
{
    public static void main(String[] args)
    {
        Stack<String> animals = new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Initial Stack: " + animals);

        // Remove element stacks
        String element = animals.pop();
        System.out.println("Removed Element:" + element);

        //return top element in stack
        String element1 = animals.peek();
        System.out.println("Element at top: " + element1);

        //search value in stack index
        int position = animals.search("Horse");
        System.out.println("Position of Horse: " + position);
    }
}