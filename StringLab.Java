import java.util.Scanner;

public class StringLab {
    public static void main(String[] args) {
        // ==========================================
        // TASK 1: Working with String Methods
        // ==========================================
        System.out.println("--- Task 1: Working with String Methods ---");
        
        // 1. Create a String variable with leading/trailing spaces
        String originalStr = " Welcome to the Java String Lab! ";
        
        // 2. Use string methods and print results
        System.out.println("length(): " + originalStr.length());
        System.out.println("charAt(7): " + originalStr.charAt(7));
        
        // Dynamic extraction of "Java"
        int javaIdx = originalStr.indexOf("Java");
        System.out.println("substring(): " + originalStr.substring(javaIdx, javaIdx + 4));
        
        System.out.println("toUpperCase(): " + originalStr.toUpperCase());
        System.out.println("toLowerCase(): " + originalStr.toLowerCase());
        System.out.println("indexOf('Java'): " + originalStr.indexOf("Java"));
        System.out.println("contains('Lab'): " + originalStr.contains("Lab"));
        System.out.println("replace(): " + originalStr.replace("Java", "Java Programming"));
        
        System.out.println("split() result:");
        String[] words = originalStr.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) { // Skip empty strings caused by extra spaces
                System.out.println("- " + word);
            }
        }
        
        System.out.println("trim(): [" + originalStr.trim() + "]");
        
        String comparisonStr = "java string lab!";
        System.out.println("equals(): " + originalStr.equals(comparisonStr));
        System.out.println("equalsIgnoreCase(): " + originalStr.equalsIgnoreCase(comparisonStr.trim()));
        System.out.println();


        // ==========================================
        // TASK 2: Loop Challenges with Strings
        // ==========================================
        System.out.println("--- Task 2: Loop Challenges with Strings ---");
        
        // For Loop: Count Vowels
        int vowelCount = 0;
        String lowerStr = originalStr.toLowerCase();
        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Vowel Count: " + vowelCount);
        
        // While Loop: Check for a Palindrome
        String palindromeWord = "racecar";
        int left = 0;
        int right = palindromeWord.length() - 1;
        boolean isPalindrome = true;
        
        while (left < right) {
            if (palindromeWord.charAt(left) != palindromeWord.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Is '" + palindromeWord + "' a palindrome? " + isPalindrome);
        
        // Do...While Loop: Input Validation
        Scanner scanner = new Scanner(System.util.in);
        String inputSentence;
        do {
            System.out.print("Enter a sentence containing the word 'Java': ");
            inputSentence = scanner.nextLine();
        } while (!inputSentence.contains("Java"));
        
        System.out.println("Thank you!");
        System.out.println();


        // ==========================================
        // TASK 3: Working with StringBuilder
        // ==========================================
        System.out.println("--- Task 3: Working with StringBuilder ---");
        
        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        
        // 1. append()
        sb.append(" - Learning Java");
        System.out.println("After append(): " + sb);
        
        // 2. insert() - Insert directly after the word "Lab"
        int labIdx = sb.indexOf("Lab");
        if (labIdx != -1) {
            sb.insert(labIdx + 3, " is fun");
        }
        System.out.println("After insert(): " + sb);
        
        // 3. delete() - Delete the word "Learning"
        int learningIdx = sb.indexOf("Learning");
        if (learningIdx != -1) {
            sb.delete(learningIdx, learningIdx + "Learning".length());
        }
        System.out.println("After delete(): " + sb);
        
        // 4. reverse()
        sb.reverse();
        System.out.println("After reverse(): " + sb);
        System.out.println();


        // ==========================================
        // TASK 4: Working with StringBuffer
        // ==========================================
        System.out.println("--- Task 4: Working with StringBuffer ---");
        
        StringBuffer sbf = new StringBuffer("Multithreading Lab");
        
        // 1. append()
        sbf.append(" - Learning Java");
        System.out.println("After append(): " + sbf);
        
        // 2. insert()
        int labIdx2 = sbf.indexOf("Lab");
        if (labIdx2 != -1) {
            sbf.insert(labIdx2 + 3, " is fun");
        }
        System.out.println("After insert(): " + sbf);
        
        // 3. delete()
        int learningIdx2 = sbf.indexOf("Learning");
        if (learningIdx2 != -1) {
            sbf.delete(learningIdx2, learningIdx2 + "Learning".length());
        }
        System.out.println("After delete(): " + sbf);
        
        // 4. reverse()
        sbf.reverse();
        System.out.println("After reverse(): " + sbf);
        
        scanner.close();
    }
}
