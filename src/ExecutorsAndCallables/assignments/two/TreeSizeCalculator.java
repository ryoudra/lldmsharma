package ExecutorsAndCallables.assignments.two;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer>{
    private Node node;
    private ExecutorService executor;

    public TreeSizeCalculator(Node node, ExecutorService executor){
        this.node= node;
        this.executor= executor;
    }

    @Override
    public Integer call() throws Exception{
        if(node==null)return 0;

// TreeSizeCalculator ka object is the task jo submit ke andar jaayega
//so here we created 2 short task jisse humara answe aayega
        TreeSizeCalculator leftTreeSizeTask= new TreeSizeCalculator(node.left, executor);
        TreeSizeCalculator rightTreeSizeTask= new  TreeSizeCalculator(node.right, executor);



        //now we gonna pass this object to executor
        Future<Integer> leftValueFuture =executor.submit(leftTreeSizeTask);
        Future<Integer> rightValueFuture= executor.submit(rightTreeSizeTask);

        return 1+leftValueFuture.get()+rightValueFuture.get();
    }
}