import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String input = scanner.nextLine();
        String cleanedS = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack <Character> stack = new Stack<>();

        for (char c : cleanedS.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        for (char c : cleanedS.toCharArray()) {
            if(stack.pop()!=c){
                isPalindrome=false;
            }
        }

        if(isPalindrome){
            System.out.println("Is it a palindrome ? "+isPalindrome);
        }else{
            System.out.println("Is it a palindrome ? "+isPalindrome);
        }
    }
}