import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0; // Số phần tử của danh sách...
    private static final int DEFAULT_CAPACITY = 10; //
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        elements = new Object[capacity];
    }
    // Thêm phần tử...
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == elements.length) {
            ensureCapacity();
        }

        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }

        elements[index] = element;
        size++;
    }
    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        // Tăng dung lượng lên 2 lần...
        elements = Arrays.copyOf(elements, newCapacity);
    }
    private void ensureCapa(){
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    // Remove tại index...
    public E remove(int index){
        checkIndex(index);
        E element = (E) elements[index];
        for(int i = index; i < size - 1; i++){
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

    private void checkIndex(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException( "Index: " + index + ", Size: " + size);
        }
    }
    public int size(){
        return size;
    }

    public MyList<E> clone(){
        MyList<E> clone = new MyList<E>();
        for(int i = 0; i < size; i++){
            clone.add((E) elements[i]);
        }
        return clone;
    }

    public boolean contains(E element){
        for(int i = 0; i < size; i++){
            if(elements[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    //indexOf
    public int indexOf(E element){
        for(int i = 0; i < size; i++){
            if(elements[i].equals(element)){
                return i;
            }
        }
        return -1;
    }
    public boolean add(E element){
        if(size == elements.length){
            ensureCapa();
        }
        elements[size++] = element;
        return true;
    }

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    public void clear(){
        for(int i = 0; i < size; i++){
            elements[i] = null;
        }
        size = 0;
    }
}

