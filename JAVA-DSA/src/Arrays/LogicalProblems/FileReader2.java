import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReader2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word to search: ");
        String target = sc.next();

        int count = 0;

        try {

            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {

                String[] words = line.split("\\s+");

                for (int i = 0; i < words.length; i++) {

                    if (words[i].equals(target)) {
                        count++;
                    }
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        System.out.println("Word occurs " + count + " times");
    }
}