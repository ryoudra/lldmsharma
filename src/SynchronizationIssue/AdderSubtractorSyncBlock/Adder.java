package SynchronizationIssue.AdderSubtractorSyncBlock;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value value;

    public Adder(Value value) {
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
//        add from 1->100
        for(long i = 0; i <10000; i++){
            synchronized (value){//synchronized ke andar shared obj ko daalna
                value.setX(value.getX()+i);
            }
//            lock.unlock();
        }
        return null;
    }
}