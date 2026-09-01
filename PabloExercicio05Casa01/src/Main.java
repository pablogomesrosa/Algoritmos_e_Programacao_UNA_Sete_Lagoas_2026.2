import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bem-vindo ao cálculo de IMC. Digite a sua altura (em metros):");
        double altura = input.nextDouble();
        System.out.print("Agora, digite o seu peso (em kilos):");
        double peso = input.nextDouble();
        double imc = peso / (altura*altura);
        System.out.print("O valor do seu IMC é" + " " + imc + ".");
    }
}