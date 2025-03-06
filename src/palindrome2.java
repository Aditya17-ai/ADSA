class Palindrome2 {
    public static void main(String[] args) {
        String s = "abcba";
        int isPalindrome = 1;
        int n = s.length();

        for (int idx = 0; idx < n / 2; idx++) {
            if (s.charAt(idx) != s.charAt(n - 1 - idx)) {
                isPalindrome = 0;
                break;
            }
        }
        if (isPalindrome == 1)
            System.out.println("Palindrome");
        else
            System.out.println("Not");
    }
}
