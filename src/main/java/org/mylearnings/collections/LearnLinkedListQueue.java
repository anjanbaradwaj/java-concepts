package org.mylearnings.collections;

import java.util.*;

public class LearnLinkedListQueue {
    public static void main(String[] args) {

        System.out.println("-----------------");
        System.out.println("LinkedListQueue");
        Queue<Integer> queue = new LinkedList<>();

        //Queue is FIFO data structure - First In First Out
        //use the offer method to add to the queue - similar to add method, but, this returns true or false when the items gets added or if it fails, whereas add throws an exception on failure
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue);

        //gives us the element that is next in line to be removed
        System.out.println(queue.peek());

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println("-----------------");
        System.out.println("PriorityQueue");
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(25);
        priorityQueue.offer(15);
        priorityQueue.offer(5);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.peek());

        System.out.println(priorityQueue.poll());

        System.out.println(priorityQueue);

        System.out.println("-----------------");
        System.out.println("Deque");

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.offer(10);
        deque.offer(5);

        System.out.println(deque);

        //add an element to the front of the queue
        deque.offerFirst(11);
        System.out.println(deque);

        //add an element to the end of the queue
        deque.offerLast(2);
        System.out.println(deque);

        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        deque.pollFirst();
        System.out.println(deque);

        deque.pollLast();
        System.out.println(deque);

        System.out.println("-----------------");



    }
}
