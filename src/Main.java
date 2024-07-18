public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        //Média calculada por 3 notas
        double media = ((9.8 + 6.3 + 8.0) /3);
        String mediaFinal= String.format("A sua media é %.1f", media);
        System.out.println(mediaFinal);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);
// estou pegando a média da nota que é do tipo double e dividindo 2 que o resultado vai inteiro
        double classificacao = (media / 2);
        String classificacaoFinal= String.format("A sua media de classificação é %.1f", classificacao);
        System.out.println(classificacaoFinal);

    }
}