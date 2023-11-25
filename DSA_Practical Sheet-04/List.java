public class List<T>
{
    //head of the List class
    private Node<T> head;
    //count variable
    private int count;
    //create an empty list
    public List()
    {
        this.head=null;
        this.count=0;
    }
    //insert new node with data to the front
//of the linked list
    public void addFront(T data)
    {
//create new node
        Node<T> node=new Node<>(data);
        if(this.isEmpty())
        {
            head=node;
        }
        else//if the list not empty
        {
            node.setNext(head);//set the head to the
            head=node;//make it first node
        }
        //head.setNext(null);
        count++;
    }

//add new node with data to the end
//of the linked list
public void addEnd(T data)
{
    //check list is empty
    if (this.isEmpty())
    {
        this.addFront(data);
    }
    else
    {
           //cretae new node
        Node<T> node = new Node<>(data);
        //add to the end of list
        Node<T> current = head;
        while (current.getNext() != null)
        {
            current = current.getNext();
        }

        current.setNext(node);
        node.setNext(null);
        count++;
    }
}
//remove the element from the linked list
public boolean remove(T data)
{
    //case 1 check the list is empty
    if(this.isEmpty())
    {
        return false;
    }
    if(head.getData().equals(data))
    {
        head=head.getNext();
        count--;
        return true;
    }
    else {
       //node having the between the node or
       //node is last node
        Node<T> current=head;
        Node<T> pre=null;
        while(current!=null )
        {
            if( current.getData().equals(data))
            {
                pre.setNext(current.getNext());//skip the current node
                count--;
                return true;
            }
           //update navigate pointer
            pre=current;
            current=current.getNext();
        }
    }
    return false;//node not found data
}
    public int size()
    {
        return count;
    }
    public void printData()
    {
        if(this.isEmpty())
        {
            System.out.println("List is Empty:..");
            return;
        }
        System.out.print("[");
        if(!this.isEmpty())
        {
            System.out.printf("%s",head.getData());
        }
        Node<T> current=head.getNext();
        while(current!=null)
        {
            System.out.printf(", %s",current.getData());
            current=current.getNext();
        }
        System.out.println("]");
    }
    public T getFont() {
        return head.getData();
    }
    //check the list is empty
    public boolean isEmpty()
    {
        return head==null;
    }
}