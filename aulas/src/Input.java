import java.util.Locale;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.print("Digite sua altura(em metros, usando ponto separdor decimal): ");
        double altura = input.nextDouble();

        System.out.print("Digite seu peso(em kg, usando ponto como separador decimal): ");
        double peso = input.nextDouble();
        // Fechar o Scanner após o uso
        input.close();




        String apresentacao = String.format("Me chamo %s, tenho %d anos, minha altura é %.2f e peso %.2f kg.", nome, idade,altura, peso);
        System.out.println(apresentacao);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(peso);


    }
}