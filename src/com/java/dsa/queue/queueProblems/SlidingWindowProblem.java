package queue.queueProblems;

import java.util.*;

public class SlidingWindowProblem {

    static List<Integer> maxWindow(List<Integer> arr, int k) {
        Deque<Integer> Idx = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < k; i++) {
            while(!Idx.isEmpty() && arr.get(Idx.getLast()) < arr.get(i)){
                Idx.removeLast();
            }
            Idx.addLast(i);
        }

        result.addLast(arr.get(Idx.getFirst()));

        for(int i = k; i < arr.size(); i++) {
            if(Idx.getFirst() == (i - k)) {
                Idx.removeFirst();
            }
            while(!Idx.isEmpty() && arr.get(Idx.getLast()) < arr.get(i)) {
                Idx.removeLast();
            }
            Idx.addLast(i);

            result.addLast(arr.get(Idx.getFirst()));
        }

        return result;
    }
    public static void main(String[] args) {
        int n;
        n = new Scanner(System.in).nextInt();

        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int x = new Scanner(System.in).nextInt();
            arr.add(x);
        }

        int k;
        k = new Scanner(System.in).nextInt();

        List<Integer> res = new ArrayList<>();

        res = maxWindow(arr, k);

        res.forEach(System.out::println);
    }
}
