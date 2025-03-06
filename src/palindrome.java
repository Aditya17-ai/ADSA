class Palindrome {
    public static void main(String[] args) {
        String s = "abcba";
        String s1 = "";
        int n = s.length();
        for (int idx = n - 1; idx >= 0; idx--) {
            s1 += s.charAt(idx);
        }
        if (s.equals(s1))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
