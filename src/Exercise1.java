public class Exercise1 {
    public static int remainder(int firstNumber,int secondNumber)
    {
        return firstNumber%secondNumber; // % - остаток от деления
    }
    public static void main(String[] args)
    {
        System.out.println(remainder(1,3));
        System.out.println(remainder(3,4));
        System.out.println(remainder(-9,45));
        System.out.println(remainder(5,5));
    }
}
