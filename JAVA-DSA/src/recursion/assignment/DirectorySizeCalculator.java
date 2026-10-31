package recursion.assignment;

import java.io.*;
import java.util.*;

public class DirectorySizeCalculator{
    static long calculateSize(File file) {
        if (file.isFile()) {
            return file.length();
        }

        long total = 0;
        File[] list = file.listFiles();

        if (list != null) {
            for (int i = 0; i < list.length; i++) {
                total = total + calculateSize(list[i]);
            }
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory path : ");
        String path = sc.nextLine();

        File file = new File(path);

        if (file.exists() && file.isDirectory()) {
            long size = calculateSize(file);

            System.out.println("Total Size in Bytes: " + size);
            System.out.println("Total Size in KB: " + (size / 1024));
        } else {
            System.out.println("Directory not found");
        }
    }
}