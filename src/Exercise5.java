public class Exercise5 {
    private static String operation(int N,int a,int b)
    {
        if(a+b == N)
            return "added";
        else if(a-b == N)
            return "substracted";
        else if(a/b == N)
            return "divided";
        else
            return "none";
    }
    public static void main(String[] args)
    {
        System.out.println(operation(24,15,9));
        System.out.println(operation(24,26,2));
        System.out.println(operation(15,11,11));
        System.out.println(operation(9,45,5));
    }
}
