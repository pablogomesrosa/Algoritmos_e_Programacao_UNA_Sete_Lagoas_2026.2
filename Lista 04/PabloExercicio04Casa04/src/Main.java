import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia = 1;
        double[] vendas = new double[5];
        double vendastotal = 0;
        double vendasmedia = 0;

        for (int i = 0; i <= 4; i++) {
            System.out.print("Total de vendas do dia " + dia + ": R$");
            vendas[i] = input.nextDouble();
            vendastotal += vendas[i];
            dia++;

        }
        System.out.printf("Faturamento total acumulado: R$%.2f\n",vendastotal);
        vendasmedia = vendastotal / 5;
        System.out.printf("Média diária de vendas da semana: R$%.2f\n",vendasmedia);

        if (vendas[0] < vendasmedia) {
            System.out.println("Segunda-feira ficou abaixo da média com R$" + vendas[0]);}
        if (vendas[1] < vendasmedia) {
            System.out.println("Terça-feira ficou abaixo da média com R$" + vendas[1]);}
        if (vendas[2] < vendasmedia) {
            System.out.println("Quarta-feira ficou abaixo da média com R$" + vendas[2]);}
        if (vendas[3] < vendasmedia) {
            System.out.println("Quinta-feira ficou abaixo da média com R$" + vendas[3]);}
        if (vendas[4] < vendasmedia) {
            System.out.println("Sexta-feira ficou abaixo da média com R$" + vendas[4]);}
        }
    }
