import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caixa = 1;
        double[] caixas = new double[6];
        int contagem = 0;

        for (int i = 0; i <= 5; i++) {
            System.out.print("Digite o peso (em kg) da caixa " + caixa + ":");
            caixas[i] = input.nextDouble();
            caixa++;
        }
        System.out.print("Digite um peso de referência para pesquisa: ");
        double peso = input.nextDouble();

        if (peso == caixas[0]) {
            contagem++;
        }
        if (peso == caixas[1]) {
            contagem++;
        }
        if (peso == caixas[2]) {
            contagem++;
        }
        if (peso == caixas[3]) {
            contagem++;
        }
        if (peso == caixas[4]) {
            contagem++;
        }
        if (peso == caixas[5]) {
            contagem++;
        }

        if (contagem != 0) {
            System.out.println("O peso " + peso + "kg foi encontrado " + contagem + " vezes.");
        } else {
            System.out.println("Valor não localizado na amostragem.");
        }
    }
}