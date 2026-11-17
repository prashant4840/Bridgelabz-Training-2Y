package BasicsProblems;

import BasicsProblems.StackOps;

public class Main {
    public static void main(String[] args) {
        StackOps st=new StackOps();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);


        System.out.print("Original Stack : ");
        st.display();

        System.out.println();

        System.out.println("The element which is removed is :- "+st.pop());

        st.display();

        System.out.println();

        System.out.println("This is the peak element : " + st.peek());

        System.out.println(st.isEmpty());

    }
}
