public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Create strategies
        PalindromeStrategy stackStrategy = new StackStrategy();

        benchmarkStrategy("Stack Strategy", stackStrategy, input);
    }

    private static void benchmarkStrategy(String name,
                                          PalindromeStrategy strategy,
                                          String input) {

        long startTime = System.nanoTime();

        boolean result = strategy.isPalindrome(input);

        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Input: " + input);
        System.out.println("Result: " + (result ? "Palindrome" : "Not Palindrome"));
        System.out.println("Execution Time (nanoseconds): " + duration);
        System.out.println("-----------------------------------");
    }
}