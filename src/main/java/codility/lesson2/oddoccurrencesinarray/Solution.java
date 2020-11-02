package codility.lesson2.oddoccurrencesinarray;

import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {
    public int solution1(int[] A) {

        Set<Integer> result = new LinkedHashSet<>();
        for (int value : A) {
            if (result.contains(value)) {
                result.remove(value);
            } else {
                result.add(value);
            }

        }

        return result.iterator().next();
    }
}
