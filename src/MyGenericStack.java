import java.util.EmptyStackException;
import java.util.LinkedList;
//Triển khai stack sử dụng lớp LinkedList trong thư viện java.util
public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    public void push(T element){
        stack.addFirst(element);
    }

    public T pop (){
        if (stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        if(stack.size() == 0){
            return true;
        }
        return false;
    }
}
