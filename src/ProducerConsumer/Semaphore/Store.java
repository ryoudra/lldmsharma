package ProducerConsumer.Semaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private ConcurrentLinkedDeque<Object> list = new ConcurrentLinkedDeque<>();
    private int MAX_SIZE = 100;

    public void add(Object o) {
        list.add(o);
        System.out.println("item is being produced now total elements in store is "+ list.size());
    }

    public void remove() {
        list.remove();
        System.out.println("item is being consumed now total elements in store is "+ list.size());
    }

    public int getMAX_SIZE(){
        return MAX_SIZE;
    }

    public ConcurrentLinkedDeque<Object> getItems() {
        return list;
    }
}
