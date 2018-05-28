package pl.ttpsc.strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearch implements SearchStrategy {

    @Override
    public boolean search(List<Integer> elements, Integer x) {
        Collections.sort(elements, Comparator.naturalOrder());
        return binarySearch(elements, 0, elements.size() - 1, x) != -1;
    }

    private int binarySearch(List<Integer> elements, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (elements.get(mid).equals(x))
                return mid;
            if (elements.get(mid) > x)
                return binarySearch(elements, l, mid - 1, x);
            return binarySearch(elements, mid + 1, r, x);
        }
        return -1;
    }

}
