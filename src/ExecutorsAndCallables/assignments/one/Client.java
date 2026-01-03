package ExecutorsAndCallables.assignments.one;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client{
    public static void main(String []args) throws ExecutionException, InterruptedException{

        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();

        ArrayCreator ac= new ArrayCreator(n);
        ExecutorService excs= Executors.newCachedThreadPool();
        Future<List<Integer>> arrayFuture= excs.submit(ac);
        excs.shutdown();

        System.out.println(arrayFuture.get());
    }
}