package SynchronizationIssue.AdderSubtractorSyncMethod;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value value;
//    private Lock lock;

    public Subtractor(Value value) {
        this.value = value;
//        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {

        for(int i=0;i<10000;i++){
//            this.value.setX(this.value.getX()-i);
            this.value.incrementBy(-i);
        }


        return null;
    }
}
