import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia = 1;
        int posicao = 0;
        double[] temperatura = new double[5];

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a temperatura do dia " + dia + " (em Celsius):");
            temperatura[posicao] = input.nextDouble();
            dia++;
            posicao++;

        }
        double temperaturatotal = temperatura[0] + temperatura[1] + temperatura[2] + temperatura[3] + temperatura[4];
        double temperaturamedia = temperaturatotal / 5;
        System.out.printf("Temperatura média da semana (em Celsius): º%.2f\n",temperaturamedia);

        if (temperatura[0] > temperaturamedia) {
            System.out.println("Segunda-feira teve a temperatura acima da média calculada.");
        }

        if (temperatura[1] > temperaturamedia) {
            System.out.println("Terça-feira teve a temperatura acima da média calculada.");
        }

        if (temperatura[2] > temperaturamedia) {
            System.out.println("Quarta-feira teve a temperatura acima da média calculada.");
        }

        if (temperatura[3] > temperaturamedia) {
            System.out.println("Quinta-feira teve a temperatura acima da média calculada.");
        }

        if (temperatura[4] > temperaturamedia) {
            System.out.println("Sexta-feira teve a temperatura acima da média calculada.");
        }


    }
}
