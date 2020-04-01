public class MyLinkedList {
    private int numNodes;
    private Node head;
    private Node tail;

    public MyLinkedList(Object data) {
        head = new Node(data);
        tail = head;
        numNodes++;
    }

    public int getNumNodes() {
        return numNodes;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public static class Node {
        private Node next;
        private Object data;
        private int index;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public void add(int index, Object data) {
        if (index == 0) {
            addFirst(data);
        } else if (index == numNodes) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int nodeIndex = 1; nodeIndex < index; nodeIndex++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            numNodes++;
        }

    }

    public void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    public void addLast(Object data) {
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
        } else if (index == numNodes) {
            removeLast();
        } else {
            Node current = head;
            for (int indexNode = 1; indexNode < index; indexNode++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    public void removeFirst() {
        head = head.next;
    }

    public void removeLast() {
        Node current = head;
        for (int indexNode = 1; indexNode < numNodes - 1; indexNode++) {
            current = current.next;
        }
        tail = current;
        tail.next = null;
    }

    public boolean removeObject(Object data) {
        if (isContains(data)) {
            Node current = head;
            for (int index = 0; index < numNodes; index++) {
                if (current.getData() == data) {
                    remove(index);
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    public boolean isContains(Object data) {
        Node current = head;
        for (int index = 0; index < numNodes; index++) {
            if (current.getData() == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int indexOf(Object data) {
        Node current = head;
        throw new UnsupportedOperationException();
    }
}
