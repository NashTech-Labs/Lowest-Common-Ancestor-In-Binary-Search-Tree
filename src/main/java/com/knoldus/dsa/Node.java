package com.knoldus.dsa;

/**
 * class Node is used to initialize
 * each node with left & right weight.
 *
 * @author shashikant
 * @version 11.0.11
 */
public class Node {

        int data;
        Node left = null, right = null;

    /**
     *
     * @param data  value of node
     */
        Node(int data) {
            this.data = data;
        }
    }

