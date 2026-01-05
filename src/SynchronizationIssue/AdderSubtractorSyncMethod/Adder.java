package SynchronizationIssue.AdderSubtractorSyncMethod;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value value;

    public Adder(Value value) {
        this.value = value;
    }

    @Override
    public Void call() throws Exception {

        for(int i=0;i<10000;i++){
//            this.value.setX(this.value.getX()+i);//here we are performing the operation and that is not locked and just
            //passing the value to synch set method to update that is not good
            // so operation has to be come under sync, lock has to present over it
            this.value.incrementBy(i);
        }

        return null;
    }
}