class Palindrome4 {
    public static void main(String[] args) {
        String s = "$a  ba";
        int i = 0;
        int j = s.length() - 1;
        int isPalindrome = 1;
        while (i < j) {
            while (i < j && !(97 <= s.charAt(i) && s.charAt(i) <= 122)) {
                i++;
            }
            while  (i < j && !(97 <= s.charAt(j) && s.charAt(j) <= 122)) {
                j--;
            }
            if (i < j && (int) s.charAt(i) != (int) s.charAt(j)) {
                isPalindrome = 0;
                break;
            }
            i++;
            j--;
        }
        if (isPalindrome == 1)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
