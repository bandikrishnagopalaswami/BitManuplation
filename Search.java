import java.util.*;

class Search {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("enter array elements");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int low = 0, high = a.length - 1, mid = 0, break_point = 0;
    while (low <= high) {
      mid = (low + high) / 2;
      if (a[mid] > a[mid + 1] / 2) {
        break_point = mid;
        break;
      } else {
        high = mid;
      }
    }
    System.out.println(break_point);
    System.out.println("enter target");
    int target = sc.nextInt();
    low = break_point;
    high = a.length - 1;
    while (low <= high) {
      mid = (low + high) / 2;
      if (a[mid] == target) {
        System.out.println(mid);
        break;
      } else if (target > a[mid]) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
  }
}