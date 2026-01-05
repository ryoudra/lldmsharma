package ProducerConsumer.SynchronisedBlockUse;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Object> list = new ArrayList<>();
    private int MAX_SIZE = 100;

    public void add(Object o) {
        System.out.println("item is being produced now size is "+ list.size());
        list.add(o);
    }

    public void remove() {
        System.out.println("item is being consumed now remaining size is "+ list.size());
      list.remove(list.size()-1);
    }

    public int getMAX_SIZE(){
        return MAX_SIZE;
    }

    public List<Object> getItems() {
        return list;
    }
}
