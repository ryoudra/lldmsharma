package ProducerConsumer.Semaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private Store store;
    private Semaphore prodSema;
    private Semaphore consSema;
    public Consumer(Store store, Semaphore prodSema, Semaphore consSema) {
        this.store = store;
        this.prodSema = prodSema;
        this.consSema = consSema;
    }
    @Override
    public void run() {
        while(true) {

            try {
                consSema.acquire();//1. take the token to enter the store of capacity 5
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
// 2. do your work ie consume
            store.remove();
//3. signal the producer to produce
            prodSema.release();

        }
    }

}
