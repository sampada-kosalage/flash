package Question10;

public class Example<T,C> {

	T obj1; 
    C obj2;  
  
    Example(T obj1, C obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

