public class Exercise8 {
    private static int nextEdge(int firstEdge,int secondEdge)
    {
        return firstEdge+secondEdge-1; // третье ребро треугольника должно быть меньше, чем a + b(firstEdge+secondEdge)
    }
    public static void main(String[] args)
    {
        System.out.println(nextEdge(8,10));
        System.out.println(nextEdge(5,7));
        System.out.println(nextEdge(9,2));
    }
}
