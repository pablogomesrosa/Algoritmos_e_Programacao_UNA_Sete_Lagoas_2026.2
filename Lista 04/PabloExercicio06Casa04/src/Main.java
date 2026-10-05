import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numerosecreto = 14;
        int tentativas = 0;
        int numero = 0;
        int tentativas2 = 1;
        ArrayList<String> palpites = new ArrayList<String>();

        while (numero != 14) {
            System.out.print("Digite um número: ");
            numero = input.nextInt();
            palpites.add(numero + "");
            tentativas++;

            if (numero != 14 && numero < 14){
                System.out.println("O número secreto é MAIOR que o palpite digitado.");
            } else if (numero != 14 && numero > 14) {
                System.out.println("O número secreto é MENOR que o palpite digitado.");
            }

        }
        System.out.println("Parábens, você adivinhou! O número secreto é 14!");
        System.out.println("Tentativas: " + tentativas);
        System.out.println("Palpites:");
        for (int i = 0; i < tentativas; i++) {
            System.out.print(tentativas2 + ")");
            System.out.println(palpites.get(i));
            tentativas2++;

        }
    }
}