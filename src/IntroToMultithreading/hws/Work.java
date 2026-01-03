package IntroToMultithreading.hws;

public class Work implements Runnable {

   private int n;
   public   Work(int n) {
       this.n = n;
   }

   @Override
    public void run() {
       System.out.println(n);
   }
}
