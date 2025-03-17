import java.util.*;
class ReverseBit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        String s="";
        while(n>0){
            s+=(char)n%2;
            n/=2;
        }
        System.out.println(s);
        int res=0;
        for(int i=0;i<s.length();i++){
            res|=(1<<(31-i));
        }
        System.out.println(res);
    }
}