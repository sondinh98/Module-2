import java.util.Arrays;

public class ArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] data;
    private int size;

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }
    public ArrayList(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }
    private void ensureCapacity(int miniCapacity) {
        int oldCapacity = data.length;
        if (miniCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            if (newCapacity < miniCapacity) {
                newCapacity = miniCapacity;
            }
            data = Arrays.copyOf(data,newCapacity);
        }
    }
    public void add(E element) {
        if (size == data.length) {
            ensureCapacity(size+1);
        }
        data[size++] = element;
    }
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E element = data[index];
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        data[--size] = null;
        return element;
    }
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }
    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E oldElement = data[index];
        data[index] = element;
        return oldElement;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean contains(E element) {
        return indexOf(element) != -1;
    }
    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (element == null) {
                if (data[i] == null) {
                    return i;
                }
            } else {
                if (element.equals(data[i])) {
                    return i;
                }
            }
        }
        return -1;
    }
    public void clear() {
        Arrays.fill(data, 0, size, null);
        size = 0;
    }

}
