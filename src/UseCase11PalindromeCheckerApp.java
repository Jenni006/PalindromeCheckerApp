public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeService service = new PalindromeService();

        String input = "A man, a plan, a canal: Panama";

        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}

class PalindromeService {

    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}