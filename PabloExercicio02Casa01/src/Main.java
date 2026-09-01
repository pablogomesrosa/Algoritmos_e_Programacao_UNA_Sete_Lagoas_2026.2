import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numero1;
        double numero2;
        double numero3;
        double numero4;

        System.out.println("Bem-vindo! Os números inseridos nos campos abaixo serão somados.");
        System.out.print("Insira o primeiro numero: ");
        numero1 = input.nextInt();
        System.out.print("Insira o segundo numero: ");
        numero2 = input.nextInt();
        System.out.print("Insira o terceiro numero: ");
        numero3 = input.nextInt();
        System.out.print("Insira o quarto numero: ");
        numero4 = input.nextInt();

        double resultado = numero1 + numero2 + numero3 + numero4;
        double resultado2 = resultado / 4;

        System.out.println("O resultado da soma dos números" + " " + numero1 + " " + numero2 + " " + numero3 + " " + numero4
                + " " + "é:" + " " + resultado + ".");
        System.out.print("A média aritmética dos números" + " " + numero1 + " " + numero2 + " " + numero3 + " " + numero4
                + " " + "é:" + " " + resultado2 + ".");

    }
}

