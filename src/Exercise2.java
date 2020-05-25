public class Exercise2 {
    public static int triArea(int base, int height)
    {
        return base*height/2; // формула площади a*h/2
    }
    public static void main(String[] args)
    {
        System.out.println(triArea(3,2));
        System.out.println(triArea(7,4));
        System.out.println(triArea(10,10));
    }
}
