public class ChocolateProblem {
    public static void main(String[] args) {
        int amount = 15;
        int price = 1;
        int neededWrappers = 3;

        int chocolates = amount / price;
        int wrappers = chocolates;

        while (wrappers >= neededWrappers) {
            int freeChocolates = wrappers / neededWrappers;
            chocolates = chocolates + freeChocolates;
            wrappers = (wrappers % neededWrappers) + freeChocolates;
        }

        System.out.println("Total chocolates = " + chocolates);
    }
}




