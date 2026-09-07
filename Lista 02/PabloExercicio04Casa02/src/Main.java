import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bem-vindo! Informe o primeiro número: ");
        int numero1 = input.nextInt();
        System.out.print("Agora, informe o segundo número: ");
        int numero2 = input.nextInt();
        System.out.print("Agora, informe o terceiro número: ");
        int numero3 = input.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.print("Entre os números " + numero1 + ", " + numero2 + ", e " + numero3 +
                    ", o maior número informado é o " + numero1 + ".");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.print("Entre os números " + numero1 + ", " + numero2 + ", e " + numero3 +
                    ", o maior número informado é o " + numero2 + ".");
        } else {
            System.out.print("Entre os números " + numero1 + ", " + numero2 + ", e " + numero3 +
                    ", o maior número informado é o " + numero3 + ".");
        }
    }
}