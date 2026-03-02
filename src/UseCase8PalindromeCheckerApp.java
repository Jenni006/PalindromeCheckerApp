import java.util.LinkedList;

public class UseCase8PalindromeCheckerApp {
    public static void main (String[] args){
        String input = "level";
        LinkedList<Character> list = new LinkedList<>();
        for(char c : input.toCharArray()){
            list.add(c);

        }
        boolean isPalindrome = true;

        while(list.size()>1){
            if(list.removeFirst()!=list.removeLast()){
                isPalindrome = false;
            }
        }

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
