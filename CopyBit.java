import java.util.*;

public class CopyBit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter m");
        int m = sc.nextInt();
        System.out.println("Enter l");
        int l = sc.nextInt();
        System.out.println("Enter r");
        int r = sc.nextInt();
        int p = (1 << (r - l));
        System.out.println(p - 1);
    }
}
