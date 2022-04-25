package DataStructure;

class LinkedList<T>{
    private class Node<T>{
        T data;
        Node next;

        public Node(T data){
            this.data = data;
            this.next = null;
        }
        public Node(T data, Node node){
            this.data = data;
            this.next = node;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public LinkedList(){

    }

    public int getSize(){
        return size;
    }   // O(1)

    public void insertFirst(T data){
        Node<T> node = new Node<>(data, head);
        head = node;
        size++;
        if(tail == null){
            tail = head;
        }
    }   // O(1)

    public void append(T data){
        if(tail == null){
            insertFirst(data);
            return;
        }
        Node<T> node = new Node<>(data);
        tail.next = node;
        tail = node;
        size++;
}   // O(1)

    public T removeFirst() throws Exception {
        if(size==0){
            throw new Exception("List is Empty");
        }
        Node<T> node = head;
        head = head.next;
        size--;
        return node.data;
    }
//    public T removeLast() throws Exception {
//        if(size==0){
//            throw new Exception("List is Empty");
//        }
//        Node current = head;
//    }

    public void printList(){
        Node<T> current = head;
        System.out.print("[");
        while(current != null){
            System.out.print(current.data+", ");
            current = current.next;
        }
        System.out.println("]");
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.append(40);
        ll.printList();
        System.out.println(ll.getSize());

        LinkedList<String> names = new LinkedList<>();
        names.append("Rohit");
        names.append("Avishkar");
        names.append("Shubham");
        names.append("Somesh");
        names.printList();
        System.out.println(names.getSize());
    }
}
