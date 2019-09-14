package Lab1;

import java.util.Iterator;
import java.util.NoSuchElementException;
public class ArrayStack<T> implements Iterable <T>{
    Object[] a;  // holds the items
    private int N;       // number of items in stack

    ArrayStack(int capacity)
    {
        a= new Object[capacity];
        N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public boolean isFull() {
        return N == a.length;
    }

    public void push(Object item) {
        a[N++] = item;
    }

    Object pop() {
        return a[--N];
    }

    public Object peek() {
        return a[N-1];
    }

    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }

    public class ReverseArrayIterator<T> implements Iterator<T> {
        private int i = N-1;

        public boolean hasNext() {
            return i >= 0;
        }

        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            return (T) a[i--];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    Object[] getA() {
        return a;
    }

    void setA(Object[] a){
        this.a = a;
    }

    int getN(){
         return N;
    }

    public void setN(int n) {
        N = n;
    }

    public class Test {

        public static main(String[] args){

            System.out.println(ReverseArrayIterator);
        }

    }


}

