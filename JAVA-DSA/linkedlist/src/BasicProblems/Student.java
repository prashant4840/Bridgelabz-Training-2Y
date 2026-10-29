package BasicProblems;

public class Student{
    String name;

    Student(String name){
        this.name=name;
    }

    public static class Main{
        public static void main(String[]args){
            Student s1=new Student("Prashant");
            System.out.println(s1.name);
        }
    }
}