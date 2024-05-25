package Interview_ONCAMPUS;
import java.util.Scanner;
public class SimpleCalculator {
    public static double add(double a,double b){
        return a+b;
    }

    public static double sub(double x,double y){
        if(x>y){
            return x-y;
        }
        else{
            return y-x;
        }
    }

    public static double mul(double x,double y){
        return x*y;
    }

    public static int div(int x,int y){
            return x / y;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Calculator program!!");
        int ch=0;
        double x=0,y=0;
        while(true){
            System.out.println(" 1- Addition Operation \n 2- Subtraction Operation \n 3- Multiplication Operation \n 4- Division Operation \n 5- Exit program \n");
            System.out.println("Enter your choice: ");
            ch=sc.nextInt();
            switch(ch){
                case 1:     System.out.println("Enter two numbers: ");
                            x=sc.nextDouble();
                            y=sc.nextDouble();
                            double res=add(x,y);
                            System.out.println(res);
                            break;
                case 2:     System.out.println("Enter two numbers: ");
                            x=sc.nextDouble();
                            y=sc.nextDouble();
                            double res2=sub(x,y);
                            System.out.println(res2);
                            break;

                case 3:     System.out.println("Enter two numbers: ");
                            x=sc.nextDouble();
                            y=sc.nextDouble();
                            double res3=mul(x,y);
                            System.out.println(res3);
                            break;

                // just for using exception handling declared int type.
                case 4:     System.out.println("Enter two numbers: ");
                            int p=sc.nextInt();
                            int q=sc.nextInt();
                            int res4=0;
                            try {
                                res4=div(p,q);
                            }catch(Exception e){
                                System.out.println("Cannot divide by zero");
                            }
                            System.out.println(res4);
                            break;

                case 5:     System.exit(0);

                default:    System.out.println("enter valid choice");
            }
        }
    }
}
