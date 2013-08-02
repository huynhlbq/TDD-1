package com.tdd.kata4;

import java.util.List;

/**
 * User: Tu
 * Date: 8/2/13
 */
public class SingleLinkedList
{
    public int size;
    private Node node;

    public SingleLinkedList(List<Object> listObject)
    {
    }

    public SingleLinkedList()
    {
        size = 0;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public Node getNode()
    {
        return node;
    }

    public void setNode(Node node)
    {
        this.node = node;
    }

    private static class Node
    {
        private Node next;
        private Object e;

        private Node getNext()
        {
            return next;
        }

        private void setNext(Node next)
        {
            this.next = next;
        }

        private Object getE()
        {
            return e;
        }

        private void setE(Object e)
        {
            this.e = e;
        }
    }
}
