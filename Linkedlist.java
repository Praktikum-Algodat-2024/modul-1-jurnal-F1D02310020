
public class Linkedlist {

    Node head = null;
    Node tail = null;
    Node curr = null;

    public void addFirst(Node n) {
        if (this.head == null) {
            head = n;
            tail = n;
        } else {
            n.next = head;
            head = n;
        }
    }

    public void addLast(Node n) {
        if (this.head == null) {
            head = n;
            tail = head;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public void deleteFirst(Node n) {
        if (head == null) {
            System.out.println("List masih kosong! ");
        } else {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
        }
    }

    public void DeleteLast() {
        if (tail == null) {
            System.out.println("List masih kosong! ");
        } else {
            if (head == tail) {
                head = tail = null;
            } else {
                curr = head;
                while (curr.next != tail) {
                    curr = curr.next;
                }
                curr.next = null;
                tail = curr;
            }
        }
    }

    public void displayList() {
        if (head == null) {
            System.out.println("Daftar masih kosong! ");
            return;
        }

        System.out.println("\nDaftar Manusia Viral:");
        System.out.println("---------------------------------------------");
        System.out.println("Nama\t\t\t|Skill\t\t\t|Umur\t|Hobi\t\t");
        System.out.println("---------------------------------------------");
        curr = head;
        while (curr != null) {

            System.out.println(curr.getData());
            curr = curr.next;
        }
        System.out.println("---------------------------------------------\n");
    }
}
