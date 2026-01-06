package ProducerConsumer.Semaphore;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Object> list = new ArrayList<>();
    private int MAX_SIZE = 100;

    public void add(Object o) {
        list.add(o);
        System.out.println("item is being produced now total elements in store is "+ list.size());
    }

    public void remove() {
        list.remove(list.size()-1);
        System.out.println("item is being consumed now total elements in store is "+ list.size());
    }

    public int getMAX_SIZE(){
        return MAX_SIZE;
    }

    public List<Object> getItems() {
        return list;
    }
}
