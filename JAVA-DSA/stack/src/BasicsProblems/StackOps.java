package BasicsProblems;

import java.util.*;

public class StackOps {
    int arr[]=new int[5];
    int top=0;
    public void push(int data){
        if(top == arr.length){
            System.out.println("Stack is full");
            return;
        }
        arr[top]=data;
        top++;
    }

    public void display() {
        for (int i = 0; i < top; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public int pop(){
        if(top == 0){
            System.out.println(" Stack overflow");
            return -1;
        }

        int data;
        top--;
        data=arr[top];
        arr[top]=0;
        return data;
    }

    public int peek() {
        return arr[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
