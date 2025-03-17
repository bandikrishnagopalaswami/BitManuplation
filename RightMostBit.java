//package BitManuplation;
import java.util.*;
class RightMostBit {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();
    int mask=1,i=0;
    while(true){
        if((n|mask)==n){
            i++;
            continue;
        }
        else{
            mask=mask<<i;
            i++;
            n=n|mask;
            break;
        }
    }
    System.out.println(n);
}
}