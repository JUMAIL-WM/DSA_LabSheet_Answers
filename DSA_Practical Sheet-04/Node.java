public class Node<T>
{
    //data to store
    private T data;
    //referance to the next
    private Node<T> next;
    //constructor set the object
    Node()
    {
        data=null;
        next =null;
    }
    //data store with in node object
    Node(T data)
    {
        this.data=data;
        this.next =null;
    }
    public T getData()
    {
        return data;
    }
    public void setData(T data)
    {
        this.data = data;
    }
    public Node<T> getNext()
    {
        return next;
    }
    public void setNext(Node<T> next)
    {
        this.next = next;
    }

}

