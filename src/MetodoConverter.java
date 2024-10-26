public class MetodoConverter {

    public static void converterMoeda(String de, String para) {
        //Este metodo implementa as taxas no valor das moedas de cada país
        try {
            double taxa = MetodoObterTaxa.obterTaxaCambio(de, para);

            System.out.print("Digite o valor a ser convertido: ");
            double valor = ConversorMoedas.lerValorValido();

            double resultado = valor * taxa;
            System.out.printf("%.2f %s = %.2f %s%n", valor, de, resultado, para);

        } catch (Exception e) {
            System.out.println("Erro ao converter moeda: " + e.getMessage());
        }
    }
}