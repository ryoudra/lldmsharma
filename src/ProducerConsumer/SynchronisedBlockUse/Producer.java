package ProducerConsumer.SynchronisedBlockUse;

public class Producer implements Runnable {

    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        //here any producer should constantly produce so

        while (true) {
            synchronized (store) {
                if (store.getMAX_SIZE() > store.getItems().size()) {
                    store.add(new Object());
                }
            }
        }
    }
}
