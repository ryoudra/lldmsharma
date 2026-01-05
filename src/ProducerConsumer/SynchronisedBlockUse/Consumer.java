package ProducerConsumer.SynchronisedBlockUse;

public class Consumer implements Runnable{

    private Store store;
    public Consumer(Store store){
        this.store = store;
    }


    @Override
    public void run() {
        while(true) {
            synchronized (store) {
                //if items avaialble then consume it
                if (store.getItems().size() > 0) {
                    store.remove();
                }
            }
        }
    }

}
