package practical7;

public class Stack {
    private int size;
    private int[] arr;
    private int top;

    public Stack(int size){
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == size-1);
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack is full!");
            return;
        }
        top++;
        arr[top] = data;
        System.out.println("Pushed element " + data);
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return;
        }
        int data = arr[top];
        top--;
        System.out.println("Popped element: " + data);
    }
}
