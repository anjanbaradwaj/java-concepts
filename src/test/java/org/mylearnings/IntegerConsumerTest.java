package org.mylearnings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mylearnings.generics.Consumer;
import org.mylearnings.generics.IntegerConsumer;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntegerConsumerTest {

    Consumer<Integer> consumer;

    @Before
    public void setUp() {
        consumer = new IntegerConsumer();
    }

    @Test
    public void addsIntegerToTheList() {

        assertTrue(consumer.consume(1));

    }

    @Test
    public void doesNotAddIntegerToTheList() {
        assertFalse(consumer.consume(100));

    }

    @After
    public void tearDown() {
        consumer = null;
    }
}
