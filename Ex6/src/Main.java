import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int i,n,m;
        System.out.print("Introduceti numarul de linii: ");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        System.out.print("Introduceti numarul de coloane: ");
        m=scanner.nextInt();
        int   a[][]=new int[n][m];
        System.out.print("Introduceti elementele matricei: ");
        for(i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++) {
                System.out.print("a[" + i + "][ "+j+"]= ");
                a[i][j] = scanner.nextInt();
            }
        }
        int x=0,max=0, l=0;

        for(i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++) {
                if(a[i][j]!=0)l++;
            }
            if (max<l){max=l;
                x=i;
            }
        }
        System.out.print("Numarul maxim este pe linia: "+x);
    }
}