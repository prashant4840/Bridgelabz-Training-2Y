package BasicsProblems;

import java.util.*;

public class StackOps {
    int arr[]=new int[5];
    int top=0;
    public void push(int data){
        arr[top]=data;
        top++;
    }

    public void display() {
        for (int i = 0; i < top; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public int pop(){
        int data;
        top--;
        data=arr[top];
        arr[top]=0;
        return data;
    }
}
