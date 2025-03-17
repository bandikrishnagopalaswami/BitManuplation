import java.util.*;
class SetBit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        int mask=1;
        System.out.println("Enter kth bit");
        int k=sc.nextInt();
        if((a&(mask<<k))==(mask<<k)){
            System.out.println("Kth bit is set");
        }
        else{
            System.out.println("Kth bit is not set");
        }
        if(((a>>k)&1)==1){
            System.out.println("Kth bit is set");
        }
        else{
            System.out.println("Kth bit is not set");
        }
    
    }
}
