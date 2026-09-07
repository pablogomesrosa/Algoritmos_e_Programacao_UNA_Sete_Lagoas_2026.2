import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bem-vindo! Informe um número: ");
        int numero = input.nextInt();

        if (numero == 0) {
            System.out.print("O número informado é ZERO.");
        } else if (numero % 2 == 0){
            int numero2 = numero * numero;
            System.out.print("O número " + numero + " é PAR e o seu quadrado é " + numero2 + ".");
        } else {
            int numero3 = numero * numero * numero;
            System.out.print("O número " + numero + " é ÍMPAR e o seu cubo é " + numero3 + ".");
        }
    }
}