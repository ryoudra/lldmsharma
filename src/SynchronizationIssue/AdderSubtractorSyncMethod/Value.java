package SynchronizationIssue.AdderSubtractorSyncMethod;

public class Value {
    private long x = 0;

    public synchronized long getX() {
        return x;
    }

    public synchronized void setX(long x) {
        this.x = x;
    }
    public synchronized void  incrementBy(long i){
        this.x+=i;
    }
}
