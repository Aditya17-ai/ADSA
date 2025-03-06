public class twosum {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int t = 50;
        int f = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] + arr[j] == t) {
                    System.out.println(t);
                    f = 1;
                    break;
                }
            }
            if (f == 1) {
                break;
            }
        }
        if (f == 0) {
            System.out.println("No pairs found that sum to " + t);
        }
    }
}
