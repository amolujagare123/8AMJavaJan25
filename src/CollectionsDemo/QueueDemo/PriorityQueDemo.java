package CollectionsDemo.QueueDemo;

import java.util.PriorityQueue;

public class PriorityQueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(21);
        pq.offer(31);
        pq.offer(22);
        pq.offer(41);
        pq.offer(25);
        pq.offer(61);
       // 21 , 22, 25, 31,41, 61
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
