import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String input = scanner.nextLine();
        String cleanedS = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Queue <Character> queue = new LinkedList<>();

        for (char c : cleanedS.toCharArray()) {
            queue.add(c);
        }

        Stack <Character> stack = new Stack<>();

        for (char c : cleanedS.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        for (char c : cleanedS.toCharArray()) {
            if(stack.pop()!=queue.remove()){
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