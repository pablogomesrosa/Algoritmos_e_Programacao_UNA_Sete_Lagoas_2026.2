import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        for (int numeroint = 1; numeroint <=10; numeroint++){
            int numeromultiplicado = numero * numeroint;
            System.out.println(numero + "*" + numeroint + "=" + numeromultiplicado);
        }
    }
}