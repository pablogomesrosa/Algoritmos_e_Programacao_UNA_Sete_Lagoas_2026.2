import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String senha = "";
        int contagem = 0;

        while (!senha.equals("0000")){
            System.out.print("Digite uma senha númerica de 4 dígitos: ");
            senha = input.nextLine();
            contagem++;


            if (senha.equals("0000")){
                System.out.println("Acesso autorizado!");
                System.out.println("Número de tentativas: " + contagem);
                } else {
                System.out.println("Senha incorreta! Tente novamente.");
            }


            }

    }
}