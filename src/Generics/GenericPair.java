package Generics;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericPair <H,R>{
    private H first;
    private R second;

    public void setFirst(H first) {
        this.first = first;
    }
    public void setSecond(R second) {
        this.second = second;
    }
    public H getFirst() {
        return first;
    }
    public R getSecond() {
        return second;
    }
}
