public class UseCase10PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPlanidrome = true;

        for (int i = 0; i < cleaned.length() / 2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(cleaned.length() - 1 - i)) {
                isPlanidrome = false;
            }
        }

        if (isPlanidrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

    }
}
