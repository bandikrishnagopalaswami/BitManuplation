import java.util.*;

public class Toggle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter k");
        int k = sc.nextInt();
        int p = 1;
        p <<= k;
        System.out.println(p);
        if (((n >> k) & 1) == 1) {
            n = n ^ p;
        } else {
            n = n | p;
        }
        System.out.print(n);
    }
}
