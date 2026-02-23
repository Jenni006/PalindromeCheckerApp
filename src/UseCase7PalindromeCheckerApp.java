import java.util.*;

public class UseCase7PalindromeCheckerApp {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String input = scanner.nextLine();
        String cleanedS = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Deque <Character> deque = new ArrayDeque<>();

        for (char c : cleanedS.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;

        while(deque.size()>1){
            if(deque.removeFirst()!= deque.removeLast()){
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