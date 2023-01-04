import java.util.Scanner;
public class Main {
    private static Scanner input;
    public static void main(String[] args) {
        int n;
        System.out.print("Introduceti numarul de elemente ale vectorului: ");
        input = new Scanner(System.in);
        n = input.nextInt();
        int v[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            System.out.print("v[" + i + "]=");
            v[i] = input.nextInt();
        }
        int nrNule = 0;
        for (i = 0; i < n; i++)
            if (v[i] == 0)
                nrNule++;
        System.out.println("Vectorul contine " + nrNule + " elemente nule.");
    }
}