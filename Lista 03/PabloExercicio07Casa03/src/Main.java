import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota = 0;
        double soma = 0;
        int contagem = -1;
,

        do {
            System.out.print("Digite uma nota: ");
            nota = input.nextDouble();
            soma += nota;
            contagem++;

        } while (nota >= 0);

        if (contagem == 0) {
            System.out.println("Digite pelo menos uma nota");
        } else {

            double soma2 = soma - nota;

            double media = soma2 / contagem;
            System.out.printf("Foram digitadas " + contagem + " notas, e a média aritmética simples delas é %.2f", media);
        }
    }
}