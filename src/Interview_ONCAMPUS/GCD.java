package Interview_ONCAMPUS;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max=0;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        int min=Math.min(a,b);
        int res=gcd(max,min);
        System.out.println("GCD of two number is: "+res);
    }

    // recursive approach of finding gcd - euclidean formula
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
}
