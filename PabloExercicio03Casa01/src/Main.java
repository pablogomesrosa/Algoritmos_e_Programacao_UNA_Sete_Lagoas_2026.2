import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bem-vindo! Digite a sua idade:");
        int idade = input.nextInt();
        int idade2 = idade*12;
        System.out.println("A idade do usuário em meses é" + " " + idade2 + ".");

    }
}

