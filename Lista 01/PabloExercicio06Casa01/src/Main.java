import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bem-vindo! Informe o seu salário:");
        double salario = input.nextDouble();
        System.out.print("Agora, informe a porcentagem de aumento que ele receberá:");
        double porcentagem = input.nextDouble();
        double porcentagem2 = porcentagem / 100;
        double aumento = salario * porcentagem2;
        double salario2 = salario + aumento;
        System.out.println("O salário informado receberá um aumento no valor de R$" + aumento + "," + " e o novo salário será" + " " + "R$" + salario2 + ".");
    }
}