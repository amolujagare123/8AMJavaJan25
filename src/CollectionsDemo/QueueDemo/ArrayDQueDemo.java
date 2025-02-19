package CollectionsDemo.QueueDemo;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ArrayDQueDemo {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(21);
        adq.offer(31);
        adq.offer(22);
        adq.offer(41);
        adq.offer(25);
        adq.offer(61);

        System.out.println(adq);

        adq.offerFirst(0);
        adq.offerLast(100);

        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);


    }
}
