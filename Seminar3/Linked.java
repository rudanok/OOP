public interface Linked<E> {
    
    void addFirst(E e);
    void addLast(E e);
    int size();
    E getItemByIndex(int counter);
}