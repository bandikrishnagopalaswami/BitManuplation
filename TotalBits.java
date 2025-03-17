import java.util.*;
public class TotalBits {
    public static void main(String args[]){
        int i=0,n=4;
        int c=0,p;
        while(n>0){
            p=n;
            while(p>0){
                System.out.println(p);
                p=p>>i;
                if((p&1)==1){
                    c++;
                }
                i=1;
            }
            i=0;
            n--;
        }
        System.out.print(c);
    }
    
}
