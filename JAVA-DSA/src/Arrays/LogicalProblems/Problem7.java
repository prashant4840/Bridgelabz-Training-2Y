import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];

        System.out.println("Enter student ages:");

        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        int[] count = new int[19];

        for (int i = 0; i < n; i++) {
            count[ages[i]]++;
        }

        System.out.println("Sorted ages:");

        for (int i = 10; i <= 18; i++) {

            for (int j = 0; j < count[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }
}