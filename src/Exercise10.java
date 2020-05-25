public class Exercise10 {
    private static boolean abcmath(int a,int b,int c)
    {
        for(int i =0;i<b;i++) // считаем в цикле, чему будет равно a после прибавления самого себя b раз
        {
            a += a;
        }
        // проверка если остаток от деления 0, значит a делится на c
        if(a%c == 0) return true;
        else return false;
    }
    public static void main(String []args)
    {
        System.out.println(abcmath(42,5,10));
        System.out.println(abcmath(5,2,1));
        System.out.println(abcmath(1,2,3));
        System.out.println(abcmath(4,3,4));
    }
}
