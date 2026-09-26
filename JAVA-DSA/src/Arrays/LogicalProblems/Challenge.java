import java.io.*;

public class Challenge {
    public static void main(String[] args) {

        int n = 1000000;

        StringBuilder sb = new StringBuilder();

        long start1 = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sb.append("hello ");
        }

        long end1 = System.nanoTime();

        StringBuffer buffer = new StringBuffer();

        long start2 = System.nanoTime();

        for (int i = 0; i < n; i++) {
            buffer.append("hello ");
        }

        long end2 = System.nanoTime();

        System.out.println("StringBuilder time = " + (end1 - start1) + " ns");
        System.out.println("StringBuffer time = " + (end2 - start2) + " ns");

        
        int wordCount = 0;

        try {

            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {

                String[] words = line.split("\\s+");

                wordCount = wordCount + words.length;
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File error");
        }

        System.out.println("Total words = " + wordCount);
        int wordCount2 = 0;

        try {

            FileInputStream fis = new FileInputStream("data.txt");

            InputStreamReader isr = new InputStreamReader(fis);

            BufferedReader br = new BufferedReader(isr);

            String line;

            while ((line = br.readLine()) != null) {

                String[] words = line.split("\\s+");

                wordCount2 = wordCount2 + words.length;
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File error");
        }

        System.out.println("InputStreamReader words = " + wordCount2);
    }
}