package Lab1;

public class RArrayStack<Item> implements Iterable<Item> {

    private Item a[];

    {
        a = new Item[8];
    }

    private int n;

    public RArrayStack(){
        a = (Item[]) new Object[];
        n=0;
         return n;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public int size(){
        return n;
    }

    private void resize(int capacity){
        assert capacity >=n;

        Item[] temp = (Item[]) new Object[capacity];
        for (int i=0; i<n; i++){
            temp[i] = a[i];

        }

        a = temp;
    }

    public void push(Item b){

        if(n == a.length) resize(2*a.length);
        a[n++] = item;
    }



}
