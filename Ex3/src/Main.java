import java.util.*;
public class Main {
    private static Scanner input;
    public static void main(String[] args) {

        System.out.print("Introduceti numarul de elemente: ");
        input=new Scanner(System.in);
        int n, pozitiv = 0, negativ=0;
        n=input.nextInt();
        int v[] = new int[n];
        for(
                int i = 0;
                i<n;i++)

        {
            System.out.println("v[" + i + "]= ");
            v[i] = input.nextInt();
        }
        for(
                int i = 0;
                i<n;i++)

        {
            if (v[i] > 0) {
                pozitiv++;
            } else negativ++;
        }
        System.out.println("Numere pozitive ="+pozitiv );
        System.out.println("Numere negative= "+negativ);
    }}