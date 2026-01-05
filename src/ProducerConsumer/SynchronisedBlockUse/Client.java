package ProducerConsumer.SynchronisedBlockUse;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        Store store = new Store();
        ExecutorService executor = Executors.newCachedThreadPool();

        for(int i = 0; i < 10; i++){
            executor.execute(new Producer(store));
        }//10 producer task submitted to thread pool via execute method jaise aapko thread mile for each
        //task ekek thread de do

        //10 producer will modify same store object at same time , real concurreny or parallelism
        //issliye lock chhaiye hoga/ synch block

        for(int i = 0; i < 10; i++){
            executor.execute(new Consumer(store));
        }

    }
}
