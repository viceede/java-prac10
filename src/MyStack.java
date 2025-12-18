import java.util.ArrayList;

public class MyStack {
    private ArrayList<Object> list;

    public MyStack() {
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.get(list.size() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.remove(list.size() - 1);
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "Stack: " + list.toString();
    }
}