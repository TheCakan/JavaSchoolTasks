
class PascalTriangle {

    public static void main(String[] args)
    {
        printPascal(6);
    }

    public static void printPascal(int n)
    {
        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {
                System.out.print(" ");
            }
            int a = 1;
            for (int i = 1; i <= line; i++) {
                System.out.print(a + " ");
                a = a * (line - i) / i;
            }
            System.out.println();
        }
    }


}
