package SynchronizationIssue.AdderSubtractorSyncBlock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value value;
//    private Lock lock;

    public Subtractor(Value value) {
        this.value = value;
//        this.lock = lock;
    }

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Void call() throws Exception {

        for(int i=0;i<10000;i++) {
//            lock.lock();
//            value.setX(value.getX() - i);
//            lock.unlock();

            synchronized (value) {
                this.value.setX(this.value.getX()-i);
            }
        }

        return null;
    }
}
