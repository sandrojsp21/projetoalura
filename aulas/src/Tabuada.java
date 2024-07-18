import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = entrada.nextInt();

        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i < 11; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        entrada.close();
    }
}
