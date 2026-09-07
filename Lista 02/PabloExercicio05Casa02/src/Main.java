import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bem-vindo! Informe uma temperatura em graus Celsius: ");
        double temperatura = input.nextDouble();
        System.out.print("Agora, digite 1 se deseja converter a temperatura para FAHRENHEIT, "
                + "ou digite 2 para KELVIN: ");
        double opcao = input.nextDouble();

        if (opcao == 1) {
            double temperaturaF = temperatura * 1.8 + 32;
            System.out.print("A temperatura informada em Fahrenheit será: " + temperaturaF + "°F.");

        }else if (opcao == 2) {
            double temperaturaK = temperatura + 273.15;
            System.out.print("A temperatura informada em Kelvin será: " + temperaturaK + " K.");
            } else {
            System.out.print("Informe uma opção válida!");
        }


        }
    }
