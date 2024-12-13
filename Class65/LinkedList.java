package Class65;

public class LinkedList {
    class Node {
        Node preLink;
        int data;
        Node nextLink;
    }

    Node first = null;

    public void insertionRear(int elem) {
        Node n = new Node();

        n.preLink = null;
        n.data = elem;
        n.nextLink = null;

        if (first == null) {
            first = n;
        } else if (first.nextLink == null) {
            first.nextLink = n;
            n.preLink = first;
        } else {
            Node temp = first;
            while (temp.nextLink != null) {
                temp = temp.nextLink;
            }
            temp.nextLink = n;
            n.preLink = temp;
        }
        System.out.println("Insertion Successfully");
    }

    public void insertionFront(int elem) {
        Node n = new Node();

        n.preLink = null;
        n.data = elem;
        n.nextLink = null;

        if (first == null) {
            first = n;
        } else {
            first.preLink = n;
            n.nextLink = first;
            first = n;
        }
    }

    public void deleteRear() {
        if (first == null) {
            System.out.println("No node to  delete");
        } else if (first.nextLink == null) {
            first = null;
            System.out.println("Node deleted");
        } else {
            Node temp = first;
            while (temp.nextLink.nextLink != null) {
                temp = temp.nextLink;
            }
            temp.nextLink.preLink = null;
            temp.nextLink = null;
            System.out.println("Node deleted");
        }
    }

    public void deleteFront() {
        if (first == null) {
            System.out.println("No Node to delete");
        } else if (first.nextLink == null) {
            first = null;
            System.out.println("Node deleted.");
        } else {
            first = first.nextLink;
            first.preLink.nextLink = null;
            first.preLink = null;
            System.out.println("Node Deleted");
        }
    }

    public void display() {
        if (first == null) {
            System.out.println("No node are present");
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

    public void deisplayBackWord() {
        if (first == null) {
            System.out.println("No Node to display");
        } else if (first.nextLink == null) {
            System.out.println(first.data);
        } else {
           Node temp = first;
           while (temp.nextLink != null) {
               temp = temp.nextLink;
           }
           while (temp != null) {
               System.out.print(temp.data + " ");
               temp = temp.preLink;
           }
            System.out.println();
        }
    }

    public void add(int elem, int pos) {
        if (first == null) {
            if (pos > 0) {
                System.out.println("Insertion not possible");
                return;
            }
            Node n = new Node();
            n.preLink = null;
            n.data = elem;
            n.nextLink = null;

            first = n;
        } else if (first.nextLink == null) {
            if (pos > 1) {
                System.out.println("Insertion not possible");
                return;
            }
            Node n = new Node();
            n.preLink = null;
            n.data = elem;
            n.nextLink = null;
            if (pos == 0) {
                first.preLink = n;
                n.nextLink = first;
                first = n;
            }
            else {
                first.nextLink = n;
                n.preLink = first;
            }
        }
    }
}
