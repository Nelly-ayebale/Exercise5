import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("A program to check if the typed word is a Palindrome");
        System.out.print("Enter a word: ");
        String word = new Scanner(System.in).nextLine().toLowerCase();
        String wordReversed = new StringBuffer(word).reverse().toString();

        if(word.equals(wordReversed)){
            System.out.println("This is a Palindrome");
        }else{
            System.out.println("This is not a Palindrome");
        }
    }
}
