import java.util.ArrayList;

public class MyStackDeepCopy implements Cloneable {
    private ArrayList<Object> list;

    public MyStackDeepCopy() {
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
    public Object clone() throws CloneNotSupportedException {
        MyStackDeepCopy cloned = (MyStackDeepCopy) super.clone();
        cloned.list = new ArrayList<>(this.list); // Глубокая копия списка
        return cloned;
    }

    @Override
    public String toString() {
        return "Stack (deep copy): " + list.toString();
    }
}