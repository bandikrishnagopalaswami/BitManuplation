import java.util.*;

public class ClearBit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter n");
        int k = sc.nextInt();
        System.out.println(n ^ (1 << k));
        int mask = ~(1 << k);
        System.out.println(mask);
        System.out.println(n & (mask));
    }
}
