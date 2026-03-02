public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Madam";

        // Inject strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        PalindromeContext context = new PalindromeContext(strategy);

        boolean result = context.execute(input);

        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
