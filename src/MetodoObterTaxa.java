import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.stream.Collectors;

public class MetodoObterTaxa {
        //Este metodo obtem as taxas que serão adicionadas nas moedas de cada país
    public static double obterTaxaCambio(String de, String para) throws IOException {
        HttpURLConnection conn = (HttpURLConnection) URI.create(ConversorMoedas.API_URL).toURL().openConnection();
        conn.setRequestMethod("GET");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Erro HTTP: " + conn.getResponseCode());
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String response = reader.lines().collect(Collectors.joining());
        reader.close();

        JsonObject jsonObject = JsonParser.parseString(response).getAsJsonObject();
        JsonObject taxas = jsonObject.getAsJsonObject("conversion_rates");

        double taxaInicial = taxas.get(de).getAsDouble();
        double taxaFinal = taxas.get(para).getAsDouble();

        return taxaInicial / taxaFinal;
    }
}
