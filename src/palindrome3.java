class Palindrome2Pointer {
    public static void main(String[] args) {
        String s = "a  ba";
        s=s.replace(" ","");
        int i = 0;
        int j = s.length() - 1;
        int isPalindrome = 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                isPalindrome = 0;
                break;
            }
            i++;
            j--;
        }
        if (isPalindrome == 1)
            System.out.println("Palindrome");
        else
            System.out.println("Not");
    }
}
