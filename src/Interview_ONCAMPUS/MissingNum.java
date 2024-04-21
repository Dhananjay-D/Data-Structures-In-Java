// Find missing number, given an array of size n-1 with integers in range of[1,N]
import java.util.*;
public class MissingNum {
    public static int missingNumber(int[] arr){
        ArrayList<Integer> li=new ArrayList<>();
        for(int i:arr){
            li.add(i);
        }
        Collections.sort(li);
        for(int i=1;i<=li.size();i++){
            if(i!=li.get(i-1)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr={1,2,4,6,3,7,8};
        int res=missingNumber(arr);
        System.out.println("Missing Number is: "+res);
    }
}
