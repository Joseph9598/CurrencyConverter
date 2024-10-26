import java.util.Scanner;

public class ConversorMoedas {
    public static final String API_KEY = "f9487f8f04754656374eee48";
    public static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/USD";
    private static final Scanner scanner = new Scanner(System.in);

    //aqui é o metodo principal onde vamos chamar todas as funções
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            exibirMenu();
            int opcao = lerOpcaoValida();

            if (opcao == 7) {
                continuar = false;
                System.out.println("Programa finalizado!");
            } else if (opcao >= 1 && opcao <= 6) {
                String[] moedas = Moedas.obterMoedasParaConversao(opcao);
                MetodoConverter.converterMoeda(moedas[0], moedas[1]);
            } else {
                System.out.println("Opção inválida, tente novamente...");
            }
        }
    }


    private static void exibirMenu() {

        System.out.println("Selecione uma opção de conversão:");
        System.out.println("1 - USD para EUR");
        System.out.println("2 - USD para GBP");
        System.out.println("3 - USD para BRL");
        System.out.println("4 - EUR para USD");
        System.out.println("5 - GBP para USD");
        System.out.println("6 - BRL para USD");
        System.out.println("7 - Sair");
    }
    //Aqui valida-se a resposta do usuário quando vai selecionar a moeda de conversão ou sair do programa
    private static int lerOpcaoValida() {
        int opcao = scanner.nextInt();
        return opcao;
    }



    // Função para ler e validar o valor digitado pelo usuário
    public static double lerValorValido() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, digite um valor numérico válido.");
            scanner.next();  // Descarta a entrada inválida
        }
        return scanner.nextDouble();
    }

}

