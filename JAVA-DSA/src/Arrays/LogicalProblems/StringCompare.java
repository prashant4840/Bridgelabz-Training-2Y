public class StringCompare {
    public static void main(String[] args) {

        int n = 1000000;

        StringBuilder sb = new StringBuilder();

        long start1 = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }

        long end1 = System.nanoTime();

        StringBuffer buffer = new StringBuffer();

        long start2 = System.nanoTime();

        for (int i = 0; i < n; i++) {
            buffer.append("hello");
        }

        long end2 = System.nanoTime();

        System.out.println("StringBuilder time = " + (end1 - start1) + " ns");
        System.out.println("StringBuffer time = " + (end2 - start2) + " ns");
    }
}