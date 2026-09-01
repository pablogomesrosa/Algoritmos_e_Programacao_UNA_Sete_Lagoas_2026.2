import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bem-vindo! Digite um número:");
        double numero1 = input.nextDouble();
        double numero1dobrado = numero1 * 2;
        System.out.println("O dobro do número" + " " + numero1 + " " + "é" + " " + numero1dobrado + ".");

    }
}