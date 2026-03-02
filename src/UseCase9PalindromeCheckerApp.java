import java.util.LinkedList;

public class UseCase9PalindromeCheckerApp {
    public static void main (String[] args){
        String input = "level";
        int start = 0;
        int end = input.length()-1;
        boolean result = check(input, start, end);
        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

    }
    private static boolean check(String s, int start, int end){
        if(start>=end) {
            return true;
        }
        if(s.charAt(start)!= s.charAt(end)){
            return false;
        }
        return check(s, start+1, end-1);

    }
}
