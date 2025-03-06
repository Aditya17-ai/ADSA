public class twosum {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int target = 50;
        int found = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Success: " + arr[i] + " + " + arr[j] + " = " + target);
                    found = 1;
                    break;
                }
            }
            if (found == 1) {
                break;
            }
        }
        if (found == 0) {
            System.out.println("No pairs found that sum to " + target);
        }
    }
}
