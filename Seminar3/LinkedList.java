import java.util.Iterator;

public class LinkedList<E> implements Linked<E>, Iterable<E> {

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    public LinkedList() {
        lastNode = new Node<>(null, firstNode, null);
        firstNode = new Node<>(null, null, lastNode);
    }

    @Override
    public void addLast(E e) {
        Node<E> prev = lastNode;
        prev.setCurrentItem(e);
        lastNode = new Node<>(null, prev, null);
        prev.setNextItem(lastNode);
        size++;
    }

    @Override
    public void addFirst(E e) {
        Node<E> next = firstNode;
        next.setCurrentItem(e);
        firstNode = new Node<>(null, null, next);
        next.setPrevItem(firstNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getItemByIndex(int counter) {
        Node<E> target = firstNode.getNextItem();
        for(int i=0;i<counter;i++){
            target = getNextItem(target);
        }
        return target.getcurrentItem();
    }

    private Node<E> getNextItem(Node<E> current){
        return  current.getNextItem();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter = 0;
            @Override
            public boolean hasNext() {
                return counter<size;
            }

            @Override
            public E next() {
                return getItemByIndex(counter++);
            }
        };
    }

    private class Node<E> {
        private E currentItem;
        private Node<E> nextItem;
        private Node<E> prevItem;

        Node(E currentItem, Node<E> prevItem , Node<E> nextItem) {
            this.currentItem = currentItem;
            this.nextItem = nextItem;
            this.prevItem = prevItem;
        }

        public E getcurrentItem() {
            return currentItem;
        }

        public Node<E> getNextItem() {
            return nextItem;
        }

        public Node<E> getPrevItem() {
            return prevItem;
        }

        public void setCurrentItem(E currentItem) {
            this.currentItem = currentItem;
        }

        public void setNextItem(Node<E> nextItem) {
            this.nextItem = nextItem;
        }

        public void setPrevItem(Node<E> prevItem) {
            this.prevItem = prevItem;
        }

    }
}