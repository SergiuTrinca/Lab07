import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m;
        System.out.println("Introdu numarul de linii:");
        n = input.nextInt();
        System.out.println("Introdu numarul de coloane: ");
        m = input.nextInt();
        int a[][] = new int[n][m];
        System.out.println("Introdu elementele matricei:");
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                System.out.print("a[" + i + "][ " + j + "]= ");
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Matricea:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                System.out.println(" " + a[i][j]);
        }
        int max= 0, l = 0;
        for(i=1;i<=n;i++)
        {
            for(j = 1;j <= m; j++) {
                if(a[i][j] == 1)
                    l++;
            }
            if (max < l)
                max = l;
            System.out.println("Numarul maxim de aparitii: " + max);
        }
    }
}