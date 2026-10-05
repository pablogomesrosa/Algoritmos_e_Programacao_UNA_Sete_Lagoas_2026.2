import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        double salario = 0;
        double salariototal = 0;
        double maiorsalario = 0;
        int salariominimo2 = 0;
        int filhos = 0;
        int filhostotal = 0;
        int populacao = 0;
        int populacao2 = 1;

        System.out.print("Digite o valor atual do salário mínimo: R$");
        double salariominimo = input.nextDouble();
        while (opcao != 2) {
            System.out.println("Habitante " + populacao2);
            System.out.print("Digite o seu salário: ");
            salario = input.nextDouble();
            salariototal += salario;
            if (salario > maiorsalario) {
                maiorsalario = salario;
            }
            if (salario <= salariominimo){
                salariominimo2++;
            }
            System.out.print("Agora, digite a sua quantidade de filhos: ");
            filhos = input.nextInt();
            filhostotal += filhos;
            populacao++;
            populacao2++;
            System.out.println("Continuar com a leitura de dados?");
            System.out.println("Digite 01 para SIM");
            System.out.println("Digite 02 para NÃO");
            opcao = input.nextInt();

            if (opcao != 1 && opcao != 2) {
                while (opcao != 1 && opcao != 2) {
                    System.out.println("Digite uma opção válida.");
                    System.out.println("Continuar com a leitura de dados?");
                    System.out.println("Digite 01 para SIM");
                    System.out.println("Digite 02 para NÃO");
                    opcao = input.nextInt();
                }
            }
        }
        double mediasalariopopulacao = salariototal / populacao;
        System.out.println("População: " + populacao + " habitantes.");
        System.out.printf("Média do salário da população: R$%.2f\n",mediasalariopopulacao);
        int mediafilhos = filhostotal / populacao;
        System.out.println("Média do número de filhos: " + mediafilhos);
        System.out.println("Maior salário coletado: R$" + maiorsalario);
        double salariominimo3 = (double) salariominimo2 / populacao * 100;
        System.out.printf ("Percentual de pessoas com salário de até 1 salário mínimo: %.2f " + "por cento" , salariominimo3);
    }
}