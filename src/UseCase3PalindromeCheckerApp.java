import java.util.Scanner;

public class UseCase3PalindromeCheckerApp{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String input = scanner.nextLine();
        String cleanedS = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindrome = true;
        String rev="";

        for(int i = cleanedS.length()-1; i>=0; i--){
            rev = rev + cleanedS.charAt(i);
        }

        for(int i = 0; i<cleanedS.length()-1; i++){
            if (cleanedS.charAt(i)!=rev.charAt(i)){
                isPalindrome = false;
            }
        }
        if(isPalindrome){
            System.out.println("Is it a palindrome ? "+isPalindrome);
        }else{
            System.out.println("Is it a palindrome ? "+isPalindrome);
        }
    }
}