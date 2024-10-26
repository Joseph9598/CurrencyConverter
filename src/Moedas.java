public class Moedas {
    //Este metodo chama todas as moedas para a conversão
    static String[] obterMoedasParaConversao(int opcao) {
        switch (opcao) {
            case 1:
                return new String[]{"USD", "EUR"};
            case 2:
                return new String[]{"USD", "GBP"};
            case 3:
                return new String[]{"USD", "BRL"};
            case 4:
                return new String[]{"EUR", "USD"};
            case 5:
                return new String[]{"GBP", "USD"};
            case 6:
                return new String[]{"BRL", "USD"};
            default:
                return new String[]{"", ""};
        }
    }
}
