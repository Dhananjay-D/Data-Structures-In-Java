package Interview_ONCAMPUS;
// IMP - static method is called first before main method

public class Main
{
    public static void main(String[] args) {
        int x=5;
        System.out.print(x+" ");
    }

    static{
        int x=10;
        System.out.print(x+" ");
    }
}