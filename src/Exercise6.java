public class Exercise6 {
    private static int ctoa(char ASCIISymbol)
    {
        return ASCIISymbol; // Просто возвращает целое число от символа, что дает нам ASCII код
    }
    public static void main(String[] args)
    {
        System.out.println(ctoa('A'));
        System.out.println(ctoa('m'));
        System.out.println(ctoa('['));
        System.out.println(ctoa('\\')); // Два обратных слэша используется для того, чтобы обозначить, что нам нужно вывести символ \, а не использовать например \n

    }
}
