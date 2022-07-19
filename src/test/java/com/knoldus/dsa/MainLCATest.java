package com.knoldus.dsa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class MainLCATest {
    /**
     * Method under test: {@link MainLCA#insert(Node, int)}
     */
    @Test
    public void testInsert() {
        Node node = MainLCA.insert(new Node(1), 1).right;
        assertNull(node.right);
        assertNull(node.left);
        assertEquals(1, node.data);
    }

    /**
     * Method under test: {@link MainLCA#insert(Node, int)}
     */
    @Test
    public void testInsert2() {
        Node node = MainLCA.insert(new Node(1), 0).left;
        assertEquals(0, node.data);
        assertNull(node.right);
        assertNull(node.left);
    }

    /**
     * Method under test: {@link MainLCA#search(Node, Node)}
     */
    @Test
    public void testSearch() {
        Node root = new Node(1);
        assertTrue(MainLCA.search(root, new Node(1)));
    }

    /**
     * Method under test: {@link MainLCA#search(Node, Node)}
     */
    @Test
    public void testSearch2() {
        Node root = new Node(0);
        assertTrue(MainLCA.search(root, new Node(1)));
    }

    /**
     * Method under test: {@link MainLCA#search(Node, Node)}
     */
    @Test
    public void testSearch3() {
        Node root = new Node(1);
        assertTrue(MainLCA.search(root, new Node(0)));
    }

    /**
     * Method under test: {@link MainLCA#LCARecursive(Node, Node, Node)}
     */
    @Test
    public void testLCARecursive() {
        // TODO: Complete this test.

        Node root = new Node(1);
        Node x = new Node(1);
        MainLCA.LCARecursive(root, x, new Node(1));
    }

    /**
     * Method under test: {@link MainLCA#LCARecursive(Node, Node, Node)}
     */
    @Test
    public void testLCARecursive2() {
        Node x = new Node(1);
        assertNull(MainLCA.LCARecursive(null, x, new Node(1)));
    }

    /**
     * Method under test: {@link MainLCA#LCARecursive(Node, Node, Node)}
     */
    @Test
    public void testLCARecursive3() {
        Node root = new Node(0);
        Node x = new Node(1);
        assertNull(MainLCA.LCARecursive(root, x, new Node(1)));
    }

    /**
     * Method under test: {@link MainLCA#LCARecursive(Node, Node, Node)}
     */
    @Test
    public void testLCARecursive6() {
        Node root = new Node(1);
        Node x = new Node(0);
        assertNull(MainLCA.LCARecursive(root, x, new Node(-1)));
    }

    /**
     * Method under test: {@link MainLCA#LCA(Node, Node, Node)}
     */
    @Test
    public void testLCA() {
        Node node = new Node(1);
        Node node1 = new Node(1);
        Node node2 = new Node(1);
        MainLCA.LCA(node, node1, node2);
        assertEquals(1, node.data);
        assertEquals(1, node1.data);
        assertEquals(1, node2.data);
    }

    /**
     * Method under test: {@link MainLCA#LCA(Node, Node, Node)}
     */
    @Test
    public void testLCA2() {
        Node node = new Node(1);
        Node node1 = new Node(1);
        MainLCA.LCA(null, node, node1);
        assertEquals(1, node.data);
        assertEquals(1, node1.data);
    }

    /**
     * Method under test: {@link MainLCA#LCA(Node, Node, Node)}
     */
    @Test
    public void testLCA3() {
        Node node = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(1);
        MainLCA.LCA(node, node1, node2);
        assertEquals(0, node.data);
        assertEquals(1, node1.data);
        assertEquals(1, node2.data);
    }

    /**
     * Method under test: {@link MainLCA#LCA(Node, Node, Node)}
     */
    @Test
    public void testLCA4() {
        Node node = new Node(1);
        Node node1 = new Node(0);
        Node node2 = new Node(1);
        MainLCA.LCA(node, node1, node2);
        assertEquals(1, node.data);
        assertEquals(0, node1.data);
        assertEquals(1, node2.data);
    }
}

