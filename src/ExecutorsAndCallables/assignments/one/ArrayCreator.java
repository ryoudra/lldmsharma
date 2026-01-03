package ExecutorsAndCallables.assignments.one;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<List<Integer>>{
    private int n;

    public ArrayCreator(int n){
        this.n=n;
    }

    public List<Integer> call() throws Exception{
        List<Integer> values= new ArrayList<>();
        for(int i=1;i<=n;i++)
            values.add(i);

        return values;
    }

}