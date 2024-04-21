package Bitwise_Manipulation;

// if the last digit in binary form contains 1 then its "odd" else "even"
// idea: do AND with  1 if we get 1 --> "odd" else "even"

public class EvenOrOdd {
    public static void main(String[] args){
        int x=3;  //0x0011 in binary form
        int res= x & 1 ;
        if(res==1){
            System.out.println("it's an odd number");
        }else{
            System.out.println("it's an even number");
        }
    }
}