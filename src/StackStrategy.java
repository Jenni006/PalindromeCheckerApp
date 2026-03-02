import java.util.Stack;

public class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String input) {

        if (input == null) return false;

        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push all characters to stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters while popping
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
