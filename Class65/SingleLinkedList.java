package Class65;

public class SingleLinkedList {
    class Node {
        int data;
        Node nextLink;
    }

    Node first = null;

    public void insertionRear(int elem) {
        Node n = new Node();
        n.data = elem;
        n.nextLink = null;

        if (first == null) {
            first = n;
        } else if (first.nextLink == null) {
            first.nextLink = n;
        } else {
            Node temp = first;
            while (temp.nextLink != null) {
                temp = temp.nextLink;
            }

            temp.nextLink = n;
        }
    }

    public void insertionFront(int elem) {
        Node n = new Node();
        n.data = elem;
        n.nextLink = null;

        if (first == null) {
            first = n;
        }
        else {
            n.nextLink = first;
            first = n;
        }
    }

    public  void deleteRear() {
        if (first == null) {
            System.out.println("No node to delete");
        } else if (first.nextLink == null) {
            first = null;
        } else {
            Node temp = first;
            while (temp.nextLink.nextLink != null) {
                temp = temp.nextLink;
            }
            temp.nextLink = null;
        }
    }

    public void deleteFront() {
        if (first == null) {
            System.out.println("No Node to delete");
        } else if (first.nextLink == null) {
            first = null;
        }
        else {
            first = first.nextLink;
        }
    }

    public void displayForward() {
        if (first == null) {
            System.out.println("No Node Present");
        } else if (first.nextLink == null) {
            System.out.println(first.data);
        } else {
            Node temp = first;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.nextLink;
            }
            System.out.println();
        }
    }
}
