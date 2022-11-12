class Assigment2 {
    // Function to check if the
    // number is palindrome
    static boolean isPalindrome(int n) {
        // if divisible by 11 then true
        if (n % 11 == 0) {
            return true;
        }

        // if not divisible by 11
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123321) ? "Palindrome" : "Not Palindrome");
    }
}