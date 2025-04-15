import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura (m): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Classificação: Peso normal.");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Classificação: Sobrepeso.");
        } else {
            System.out.println("Classificação: Obesidade.");
        }

        scanner.close();
    }
}
