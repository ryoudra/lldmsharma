package IntroToMultithreading.additionalproblems.six;

public class TableCreator implements Runnable{
    private int n;

    public TableCreator(int n){
        this.n= n;
    }

    public void print(){
        for(int i=1;i<=10;i++)
            System.out.println(n+" times "+i+" is "+n*i);
    }

    public void run(){
        print();
    }
}