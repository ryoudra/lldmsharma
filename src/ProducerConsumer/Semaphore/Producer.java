package ProducerConsumer.Semaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    private Store store;
    private Semaphore prodSema;
    private Semaphore consSema;
    public Producer(Store store, Semaphore prodSema, Semaphore consSema) {
        this.store = store;
        this.prodSema = prodSema;
        this.consSema = consSema;
    }

    @Override
    public void run() {
        //here any producer should constantly produce so

        while (true) {

            try {
                prodSema.acquire();//1. acquire the token to enter
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //2. produce the item
            store.add(new Object());
            //3. signal the consumer to consume
            consSema.release();

        }
    }
}
