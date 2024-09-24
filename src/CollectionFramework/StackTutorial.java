package CollectionFramework;

import java.util.Stack;

public class StackTutorial {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(1);
        st.push(2);
        st.push(1);
        st.push(2);
        st.pop();

        System.out.println(st);
        System.out.println(st.peek());
    }
}
