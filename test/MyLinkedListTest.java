class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(10);
        System.out.println(myLinkedList.getHead());
        MyLinkedList.Node node = myLinkedList.getHead();
        System.out.println(node.getNext());
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);
        myLinkedList.add(4, 9);
        myLinkedList.add(4, 9);
        myLinkedList.printList();
    }
}