import java.util.*;
public class reverseStack {
    public static void main(String[] args){
        Stack<Integer> stk=new Stack<>();
        ArrayList<Integer> temp=new ArrayList<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        System.out.println("Stack elements: "+stk);
        while(!stk.isEmpty()){
            temp.add(stk.pop());
        }
        for(int i:temp){
            stk.push(i);
        }
        System.out.println("Reversed Stack Elements: "+stk);
    }
}
