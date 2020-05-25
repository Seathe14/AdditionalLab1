public class Exercise3 {
    public static int animals(int chickens,int cows,int pigs)
    {
        // у коров и свиней одинаковое количество ног
        //поэтому я их объединил в сумму и сразу умножил на 4, чтобы не умножать по два раза
        return chickens*2 + (cows+pigs)*4;
    }
    public static void main(String[] args)
    {
        System.out.println(animals(2,3,5));
        System.out.println(animals(1,2  ,3));
        System.out.println(animals(5,2,8));
    }
}
