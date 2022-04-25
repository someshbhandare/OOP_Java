package DataStructure;

import java.util.Scanner;

class Stack{
    int[] arr;
    int top = -1;

    Stack(int capacity){
        arr = new int[capacity];
    }

    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (top == arr.length-1);
    }

    public void push(int data){
        if(isFull()){
            try {
                throw new Exception("Stack is Full");
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
        arr[++top] = data;
    }

    public int pop(){
        if(isEmpty()){
            try {
                throw new Exception("Stack is empty");
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }

        int data = arr[top];
        top--;
        return data;
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack(10);
        System.out.println("Stack of capacity " + 10 +" is created");

        while(true){
            System.out.println();
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Exit");
            System.out.println("Enter your operation: ");
            int n = sc.nextInt();

            switch (n){
                case 1:
                    if(st.isFull()){
                        System.out.println("Stack is Full");
                        break;
                    }
                    System.out.println("Enter data to push: ");
                    int data = sc.nextInt();
                    st.push(data);
                    System.out.println(data + " is pushed into the stack");
                    break;

                case 2:
                    if(st.isEmpty()){
                        System.out.println("Stack is Empty");
                        break;
                    }
                    int data1 = st.pop();
                    System.out.println(data1 + " is popped from the stack");
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}
