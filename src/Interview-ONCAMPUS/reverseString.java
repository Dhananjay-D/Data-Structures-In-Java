public class reverseString {
    public static void main(String[] args){
        String name="dhananjay";
        System.out.println("Original String is: "+name);
        StringBuilder str=new StringBuilder(name);
        name=str.reverse().toString();
        System.out.println("Reversed String is: "+name);
    }
}
