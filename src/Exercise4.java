public class Exercise4 {
    private static boolean profitableGamble(double prob, int prize,int pay)
    {
        return (prob*prize-pay) > 0; // сразу проверяет и возвращает булевый результат true/false
    }
    public static void main(String[] args)
    {
        System.out.println(profitableGamble(0.2,50,9));
        System.out.println(profitableGamble(0.9,1,2));
        System.out.println(profitableGamble(0.9,3,2));
    }
}
