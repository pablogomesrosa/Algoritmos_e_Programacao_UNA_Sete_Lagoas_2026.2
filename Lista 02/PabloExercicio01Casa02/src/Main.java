import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bem-vindo nadador! Informe a sua idade:");
        int idade = input.nextInt();

        if (idade <= 12) {
            System.out.print("Você está classificado na categoria Infantil!");
        } else if (idade >=18) {
            System.out.print("Você está classificado na categoria Adulto!");
        } else {
            System.out.print("Você está classificado na categoria Juvenil!");
        }
    }
}