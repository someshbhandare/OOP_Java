package practical7;

//class StackUnderflowError extends Exception {
//    StackUnderflowError(String message){
//        throw
//    }
//}

public class StackLL {
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    private Node top;

    public boolean isEmpty(){
        return top==null;
    }

    public void push(int data){
        Node node = new Node(data);
        node.next = top;
        top = node;
        System.out.println("Pushed to stack: " + top.data);
    }

    public void pop(){
        if(isEmpty()){
            try {
                throw new Exception("!! Stack Underflow !!");
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        int data = top.data;
        top = top.next;
        System.out.println("Popped from stack: " + data);
    }
}
