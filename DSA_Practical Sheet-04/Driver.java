// use < T> to specify Parameter type T is Specific type
class Gn<T>
{
    // object of type T is declared
    T object;
    Gn(T obj) { this.object = obj; } // constructor
    public T getObject()
    {
        return this.object;
    }
}

//Driver class
class Generics1
{
    public static void main(String[] args)
    {
        // instance of Integer type
        Gn<Integer> iObj = new Gn<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        Gn<String> sObj
                = new Gn<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
    }

}