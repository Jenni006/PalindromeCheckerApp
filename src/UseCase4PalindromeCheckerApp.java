import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String input = scanner.nextLine();
        String cleanedS = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char [] chars = cleanedS.toCharArray();
        int start = 0;
        int end = chars.length-1;
        boolean isPalindrome = true;

        while(start<end){
            if(chars[start]!=chars[end]){
                isPalindrome = false;
            }else{
                start++;
                end--;
            }
        }
        if(isPalindrome){
            System.out.println("Is it a palindrome ? "+isPalindrome);
        }else{
            System.out.println("Is it a palindrome ? "+isPalindrome);
        }
    }
}