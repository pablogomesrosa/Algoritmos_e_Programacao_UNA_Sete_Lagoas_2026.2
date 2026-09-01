import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bem-vindo! Digite o valor do produto:");
        double produto = input.nextDouble();
        double produto2 = produto - produto*0.1;
        System.out.println("O valor do produto com 10% de desconto é" + " " + "R$" + produto2 + ".");
    }
}

