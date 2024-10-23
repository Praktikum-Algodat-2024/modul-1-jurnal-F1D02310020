
public class SingleLinkedlist {

    private Node head = null;

    public void addLast(Node newNode) {
        if (head == null) {
            head = newNode;

        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            newNode.next = head;
        }
    }

    public void addFirst(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void deleteFirst(Node n) {
        if (node = null) {

        }
    }
}
