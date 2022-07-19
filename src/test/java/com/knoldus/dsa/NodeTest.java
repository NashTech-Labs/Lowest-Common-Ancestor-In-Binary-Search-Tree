package com.knoldus.dsa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class NodeTest {
    /**
     * Method under test: {@link Node#Node(int)}
     */
    @Test
    public void testConstructor() {
        Node actualNode = new Node(1);
        assertEquals(1, actualNode.data);
        assertNull(actualNode.right);
        assertNull(actualNode.left);
    }
}

