import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor para A:");
        double a = input.nextDouble();
        System.out.print("Digite um valor para B:");
        double b = input.nextDouble();
        double c = a;
        a = b;
        b = c;

        System.out.print("O novo valor de A é" + " " + a + " " + "e o novo valor de B é" + " " + b + ".");

    }
}