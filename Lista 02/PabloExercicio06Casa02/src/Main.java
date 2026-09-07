import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem-vindo ao emissor de notas fiscais!");
        System.out.print("Informe o código do produto: ");
        int codigo = input.nextInt();
        System.out.print("Agora, informe a quantidade comprada: ");
        int quantidade = input.nextInt();

        if (codigo <= 40 && codigo >= 31) {
            System.out.println("O preço unitário do produto informado é R$30,00.");
            double precototal4 = quantidade * 30; //Preço total 4 referente ao código 4
            System.out.println("O preço total da nota é R$" + precototal4 + ".");
            if (precototal4 <= 250) {
                double desconto1111 = precototal4 * 0.05; //Desconto 4 referente ao preço total 4
                System.out.println("O percentual de desconto calculado para essa nota foi de 5% "
                        + "(-R$" + desconto1111 + ").");
                double precofinal1111 = precototal4 - desconto1111; //Preço final do código 4 com o desconto 4
                System.out.println("O preço final da nota será R$" + precofinal1111 + ".");
            } else if (precototal4 <= 500) {
                double desconto2222 = precototal4 * 0.10;
                System.out.println("O percentual de desconto calculado para essa nota foi de 10% "
                        + "(-R$" + desconto2222 + ").");
                double precofinal2222 = precototal4 - desconto2222;
                System.out.println("O preço final da nota será R$" + precofinal2222 + ".");
            } else {
                double desconto3333 = precototal4 * 0.15;
                System.out.println("O percentual de desconto calculado para essa nota foi de 15% "
                        + "(-R$" + desconto3333 + ").");
                double precofinal3333 = precototal4 - desconto3333;
                System.out.println("O preço final da nota será R$" + precofinal3333 + ".");
            }

        } else if (codigo <= 30 && codigo >= 21) {
            System.out.println("O preço unitário do produto informado é R$20,00.");
            double precototal3 = quantidade * 20; //Preço total 3 referente ao código 3
            System.out.println("O preço total da nota é R$" + precototal3 + ".");
            if (precototal3 <= 250) {
                double desconto111 = precototal3 * 0.05; //Desconto 3 referente ao preço total 3
                System.out.println("O percentual de desconto calculado para essa nota foi de 5% "
                        + "(-R$" + desconto111 + ").");
                double precofinal111 = precototal3 - desconto111; //Preço final do código 3 com o desconto 3
                System.out.println("O preço final da nota será R$" + precofinal111 + ".");
            } else if (precototal3 <= 500) {
                double desconto222 = precototal3 * 0.10;
                System.out.println("O percentual de desconto calculado para essa nota foi de 10% "
                        + "(-R$" + desconto222 + ").");
                double precofinal222 = precototal3 - desconto222;
                System.out.println("O preço final da nota será R$" + precofinal222 + ".");
            } else {
                double desconto333 = precototal3 * 0.15;
                System.out.println("O percentual de desconto calculado para essa nota foi de 15% "
                        + "(-R$" + desconto333 + ").");
                double precofinal333 = precototal3 - desconto333;
                System.out.println("O preço final da nota será R$" + precofinal333 + ".");
            }
        } else if (codigo <= 20 && codigo >= 11) {
            System.out.println("O preço unitário do produto informado é R$15,00.");
            double precototal2 = quantidade * 15; //Preço total 2 referente ao código 2
            System.out.println("O preço total da nota é R$" + precototal2 + ".");
            if (precototal2 <= 250) {
                double desconto11 = precototal2 * 0.05; //Desconto 2 referente ao preço total 2
                System.out.println("O percentual de desconto calculado para essa nota foi de 5% "
                        + "(-R$" + desconto11 + ").");
                double precofinal11 = precototal2 - desconto11; //Preço final do código 2 com o desconto 2
                System.out.println("O preço final da nota será R$" + precofinal11 + ".");
            } else if (precototal2 <= 500) {
                double desconto22 = precototal2 * 0.10;
                System.out.println("O percentual de desconto calculado para essa nota foi de 10% "
                        + "(-R$" + desconto22 + ").");
                double precofinal22 = precototal2 - desconto22;
                System.out.println("O preço final da nota será R$" + precofinal22 + ".");
            } else {
                double desconto33 = precototal2 * 0.15;
                System.out.println("O percentual de desconto calculado para essa nota foi de 15% "
                        + "(-R$" + desconto33 + ").");
                double precofinal33 = precototal2 - desconto33;
                System.out.println("O preço final da nota será R$" + precofinal33 + ".");
            }
        } else if (codigo <= 10 && codigo >= 1) {
            System.out.println("O preço unitário do produto informado é R$10,00.");
            double precototal1 = quantidade * 10; //Preço total 1 referente ao código 1
            System.out.println("O preço total da nota é R$" + precototal1 + ".");
            if (precototal1 <= 250) {
                double desconto1 = precototal1 * 0.05; //Desconto 1 referente ao preço total 1
                System.out.println("O percentual de desconto calculado para essa nota foi de 5% "
                        + "(-R$" + desconto1 + ").");
                double precofinal1 = precototal1 - desconto1; //Preço final do código 1 com o desconto 1
                System.out.println("O preço final da nota será R$" + precofinal1 + ".");
            } else if (precototal1 <= 500) {
                double desconto2 = precototal1 * 0.10;
                System.out.println("O percentual de desconto calculado para essa nota foi de 10% "
                        + "(-R$" + desconto2 + ").");
                double precofinal2 = precototal1 - desconto2;
                System.out.println("O preço final da nota será R$" + precofinal2 + ".");
            } else {
                double desconto3 = precototal1 * 0.15;
                System.out.println("O percentual de desconto calculado para essa nota foi de 15% "
                        + "(-R$" + desconto3 + ").");
                double precofinal3 = precototal1 - desconto3;
                System.out.println("O preço final da nota será R$" + precofinal3 + ".");
            }


        } else {
            System.out.println("Informe um código válido!");
        }
    }
}