package org.mylearnings.collections;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CollectionsTest {

    @Test
    public void testQueueCollection() {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(50);
        queue.offer(5);
        queue.offer(25);

        assertTrue(50 == queue.poll());

        queue.clear();

        queue = new PriorityQueue<>();
        queue.offer(50);
        queue.offer(5);
        queue.offer(25);

        assertFalse(50 == queue.poll());

        queue.clear();

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offer(50);
        deque.offer(5);
        deque.offer(25);

        assertTrue(50 == deque.pollFirst());
        assertTrue(25 == deque.pollLast());

    }
}
