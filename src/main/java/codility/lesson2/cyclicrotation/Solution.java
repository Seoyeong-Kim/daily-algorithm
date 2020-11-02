package codility.lesson2.cyclicrotation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int[] A, int K) {
       LinkedList<Integer> result =  Arrays.stream(A)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));
       if(result.isEmpty()) {
           return new int[]{};
       }

       for(int i=0; i<K; i++) {
           int temp = result.getLast();
           result.removeLast();
           result.addFirst(temp);
       }

       return result.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        new Solution().solution(new int[]{}, 3);
    }
}
