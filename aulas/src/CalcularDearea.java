import java.util.Scanner;

public class CalcularDearea {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int escolha;

        System.out.println("Menu:");
        System.out.println("1. Calcular área do qudrado");
        System.out.println("2. Calcular área do cículo");
        System.out.println("Escolha umas das opção ( 1 ou 2 ): ");
        escolha = entrada.nextInt();


        switch (escolha) {
            case 1:
                System.out.println("Digite o comprimento do lado quadrado: ");
                double lado = entrada.nextDouble();
                double areaQuadrada = lado * lado;
                System.out.println("A área do quadrdo é: " + areaQuadrada);
                break;
            case 2:
                System.out.println("Digite o raio do círculo: ");
                double raio = entrada.nextDouble();
                double areaCirculo = Math.PI * raio * raio;
                System.out.println("A área do círculo é: " + areaCirculo);
                break;

            default:
                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
                break;
        }

        entrada.close();
    }
}
