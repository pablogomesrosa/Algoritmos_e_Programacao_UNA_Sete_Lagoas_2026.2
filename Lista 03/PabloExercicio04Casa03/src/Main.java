import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = input.nextInt();
        for (int nn = 1; nn <= n; nn++) {
            System.out.println("Praticando lógica de programação " + nn);
        }
    }
}