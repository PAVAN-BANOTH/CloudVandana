package in.pspk;

public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        
        boolean isPangram = checkPangram(input);

        if (isPangram) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }

    public static boolean checkPangram(String input) {
        input = input.toLowerCase();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (input.indexOf(ch) == -1) {
                return false; 
            }
        }

        return true; 
    }
}
