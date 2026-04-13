import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        
        if (sentence.trim().isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            String[] words = sentence.trim().split("\\s+");
            int wordCount = words.length;
            
            int charCount = sentence.replaceAll("\\s+", "").length();
            
            System.out.println("Word count: " + wordCount);
            System.out.println("Character count (without spaces): " + charCount);
            System.out.println("Total characters (with spaces): " + sentence.length());
        }
        scanner.close();
    }
}
