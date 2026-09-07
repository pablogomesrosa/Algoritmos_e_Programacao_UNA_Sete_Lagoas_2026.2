import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem-vindo ao verificador de elegibilidade para financiamento bancário.");
        System.out.print("Informe o valor da sua renda mensal: ");
        double renda = input.nextDouble();
        System.out.print("Agora, informe o valor da prestação mensal que deseja pagar no financiamento: ");
        double prestacao = input.nextDouble();
        double relacao = (prestacao / renda) * 100;

        if (relacao > 30) {
            System.out.println("Financiamento negado por alta prestação");
        } else if (prestacao > 3000 && renda < 10000) {
            System.out.println("Financiamento negado por baixa renda");
        } else {
            System.out.println("Financiamento aprovado! Você pode assumir essa prestação com segurança.");
        }
    }
}
