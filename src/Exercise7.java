public class Exercise7 {
    private static int addUpTo(int num)
    {
        // сумма чисел начиная от 1 до num просто складывается в цикле
        int sum = 0;
        for(int i =1;i<=num;i++)
        {
            sum +=i;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(addUpTo(3));
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(7));
    }
}
