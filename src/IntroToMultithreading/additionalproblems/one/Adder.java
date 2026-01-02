package IntroToMultithreading.additionalproblems.one;

public class Adder implements Runnable{

    private int a;
    private int b;

    public Adder(int a, int b){
        this.a= a;
        this.b=b;
    }
    public void print(){
        System.out.println(a+b);
    }

    @Override
    public void run(){
        print();

    }

}