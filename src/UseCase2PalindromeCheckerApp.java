import java.util.Scanner;

public class UseCase2PalindromeCheckerApp{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String input = scanner.nextLine();
        String cleanedS = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindrome = true;

        for(int i = 0; i<cleanedS.length()/2; i++){
            if(cleanedS.charAt(i)!=cleanedS.charAt(cleanedS.length()-1-i)){
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