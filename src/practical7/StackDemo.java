package practical7;

public class StackDemo {
    public static void main(String[] args) {
        Stack st = new Stack(5);
        System.out.println("===================");
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println(st.isEmpty());
        System.out.println("===================");
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        System.out.println("===================");
    }
}
