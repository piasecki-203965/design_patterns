package pl.ttpsc.strategy;

import java.util.List;

public class LinearSearch implements SearchStrategy {

    @Override
    public boolean search(List<Integer> elements, Integer x) {
        for (Integer element : elements) {
            if (element.equals(x)) {
                return true;
            }
        }
        return false;
    }

}
