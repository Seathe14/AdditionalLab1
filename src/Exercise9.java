public class Exercise9 {
    // фукнция для подсчета куба
    private static int cube(int number) {
        return number * number * number;
    }
    private static int sumOfCubes(int[] numbers) // параметром принимает массив
    {
        int sum = 0;
        // в цикле считает сумму кубов каждого элемента массива.
        for(int i =0;i<numbers.length;i++)
        {
            sum += cube(numbers[i]);
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(sumOfCubes(new int[] {1 ,5, 9})); // создаем массив, чтобы функция смогла его принять
        System.out.println(sumOfCubes(new int[] {3 ,4, 5}));
        System.out.println(sumOfCubes(new int[] {2}));
        System.out.println(sumOfCubes(new int[] {}));
    }
}
