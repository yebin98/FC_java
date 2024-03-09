package fc.java.part6.model;

public class ObjectArray<T> {
    private T[] array;
    private int size;
    public ObjectArray(int size){
        array = (T[]) new Object[size];
    }

    public void set(int index, T value) {
        array[index] = value;
        size++;
    }
    public T get(int index) {
        return array[index];
    }
    public int size() {
        return size;
    }

}
