import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente al vectorului:");
        int n = input.nextInt();
        int v[] = new int[n];
        int i;
        for(i = 0; i < n; i++) {
            System.out.println("V[" + i + "] = ");
            v[i] = input.nextInt();
        }
        int min;
        for(i = 0; i < n; i++) {
            min = 10000;
            if(min > v[i]) min = v[i];
            System.out.println("Minimul vectorului " + i + " este egal cu " + min);
        }
    }
}