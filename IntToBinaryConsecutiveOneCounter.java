
package inttobinaryconsecutiveonecounter;
import java.util.*;


public class IntToBinaryConsecutiveOneCounter {

    public static String intToBinary(int n) {
        if (n == 0) {
            return "";
        } else {
            return String.valueOf(n % 2)+ intToBinary(n / 2);
        }
    }
    
    public static int consecutiveOneCount(String bi) {
        int count = 0;
        for (int i = 1; i < bi.length(); i++) {
            if (bi.charAt(i - 1) == '1' && bi.charAt(i -1) == bi.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);
   
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        String binaryString = intToBinary(n);
        System.out.println(binaryString);
        int numberOfConsecutiveOnes = consecutiveOneCount(binaryString);
        System.out.println(numberOfConsecutiveOnes);
    }
    
}
