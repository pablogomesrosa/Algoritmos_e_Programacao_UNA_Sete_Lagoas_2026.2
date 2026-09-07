import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bem-vindo! Informe a quantidade consumida de kWh: ");
        double kWh = input.nextDouble();

        if (kWh <=100) {
            double kWh1 = kWh * 0.50;
            System.out.print("O valor da sua conta de energia será no valor de R$" + kWh1);
        }else if (kWh > 200){
            double kWh2 = kWh * 0.90;
            System.out.print("O valor da sua conta de energia será no valor de R$" + kWh2);
        }else {
            double kWh3 = kWh * 0.70;
            System.out.print("O valor da sua conta de energia será no valor de R$" + kWh3);
        }
    }
}