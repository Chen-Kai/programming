public class LinkedList {

    private class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void add(String data) {
        Node node = new Node(data);

        if (last == null) {
            first = node;
        } else {
            last.next = node;
        }
        last = node;
        size++;
    }

    public String remove(int index) {
        Node x = first;
        Node prev = first;

        for (int i = 0; i < index; i++) {
            prev = x;
            x = x.next;
        }

        if (x == first) {
            first = first.next;
        } else {
            prev.next = x.next;
        }
        x.next = null;
        size--;
        return x.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        for (Node x = first; x != null; x = x.next) {
            buf.append(x.data + " ");
        }
        return buf.toString();
    }

    public static void main(String[] args) {
       LinkedList list = new LinkedList();
        for (int i = 0; i < 26; i++) {
            list.add(String.valueOf((char)('A' + i)));
        }
        System.out.println(list);

        while (!list.isEmpty()) {
            System.out.print(list.remove(0) + " ");
        }
        System.out.println("\n" + list.size());
    }
}
