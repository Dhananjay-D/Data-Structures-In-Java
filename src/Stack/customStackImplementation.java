package Stack;
public class customStackImplementation {

    int[] stack;
    static int temp=-1;

    public customStackImplementation(int size){
        this.stack=new int[size];
    }

    public void push(int item){
        if(temp==stack.length-1){
            System.out.println("stack is full");
            return;
        }
        temp++;
        stack[temp]=item;
    }

    public int pop() throws Exception {
        if(temp==-1){
            throw new Exception("Stack is Empty!!");
        }
        int ele=stack[temp];
        temp--;
        return ele;
    }

    public int peek() throws Exception {
        if(temp==-1){
            throw new Exception("Stack is Empty!!");
        }
        return(stack[temp]);
    }


    public static void main(String[] args) {
        customStackImplementation stk1=new customStackImplementation(5);

        stk1.push(1);
        stk1.push(2);
        stk1.push(3);
        stk1.push(4);
        stk1.push(5);

        try{
            System.out.println("peek elem is: "+stk1.peek());
        }catch(Exception e){
            System.out.println(e);
        }

        while(temp!=-1){
            try{
                System.out.print(stk1.peek()+" ");
                stk1.pop();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
}
