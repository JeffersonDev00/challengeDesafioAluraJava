import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.util.Scanner.*;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException{
        String moeda;
        double valor = 0;
        int opcao=0;

        Scanner dados = new Scanner(System.in);
        Menu menu = new Menu();
        ConsultaDeMoeda consulta = new ConsultaDeMoeda();
        while (opcao!=8) {
            menu.MenuSelecao();
            try {
                opcao = dados.nextInt();

            if (opcao == 1) {
                menu.MenuValor();
                valor = dados.nextDouble();
                moeda = "USD";
                double taxaDeConversao = consulta.buscaTaxaDeConversao(moeda);
                System.out.println("Taxa de conversão de " + "Dólar" + " para Reais(Brasil): " + taxaDeConversao);
                System.out.println("R$ " + taxaDeConversao * valor);

            } else if (opcao == 2) {
                menu.MenuValor();
                valor = dados.nextDouble();
                moeda = "CHF";
                double taxaDeConversao = consulta.buscaTaxaDeConversao(moeda);
                System.out.println("Taxa de conversão de " + "Franco Suíço" + " para Reais(Brasil): " + taxaDeConversao);
                System.out.println("R$" + taxaDeConversao * valor);

            } else if (opcao == 3) {
                menu.MenuValor();
                valor = dados.nextDouble();
                moeda = "JPY";
                double taxaDeConversao = consulta.buscaTaxaDeConversao(moeda);
                System.out.println("Taxa de conversão de " + "Iene Japonês" + " para Reais(Brasil): " + taxaDeConversao);
                System.out.println("R$" + taxaDeConversao * valor);

            } else if (opcao == 4) {
                menu.MenuValor();
                valor = dados.nextDouble();
                moeda = "AED";
                double taxaDeConversao = consulta.buscaTaxaDeConversao(moeda);
                System.out.println("Taxa de conversão de " + "Dirham dos Emirados Árabes Unidos" + " para Reais(Brasil): " + taxaDeConversao);
                System.out.println("R$" + taxaDeConversao * valor);

            } else if (opcao == 5) {
                menu.MenuValor();
                valor = dados.nextDouble();
                moeda = "AFN";
                double taxaDeConversao = consulta.buscaTaxaDeConversao(moeda);
                System.out.println("Taxa de conversão de " + "Afegane afegão para real" + " para Reais(Brasil): " + taxaDeConversao);
                System.out.println("R$" + taxaDeConversao * valor);

            } else if (opcao == 6) {
                menu.MenuValor();
                valor = dados.nextDouble();
                moeda = "AMD";
                double taxaDeConversao = consulta.buscaTaxaDeConversao(moeda);
                System.out.println("Taxa de conversão de " + "Dram armênio para real, para Reais(Brasil): " + taxaDeConversao);
                System.out.println("R$" + taxaDeConversao * valor);

            } else if (opcao == 7) {
                menu.MenuValor();
                valor = dados.nextDouble();
                moeda = "ANG";
                double taxaDeConversao = consulta.buscaTaxaDeConversao(moeda);
                System.out.println("Taxa de conversão de " + "Florim das Antilhas Holandesas" + " para Reais(Brasil): " + taxaDeConversao);
                System.out.println("R$" + taxaDeConversao * valor);

            } else if (opcao == 8) {
                System.out.println("Esperamos que você tenha tido uma ótima experiência. Seu feedback é muito importante para nós e nos ajuda a melhorar continuamente." +
                        " Caso tenha alguma sugestão, dúvida ou queira compartilhar sua experiência, por favor, entre em contato conosco." +
                        "Até a próxima!");

            } else {
                System.out.println("Parece que você selecionou uma opção inválida." +
                        " Por favor, verifique as opções disponíveis e tente novamente." +
                        " Se precisar de ajuda, sinta-se à vontade para entrar em contato com nosso suporte.");
            } }catch(InputMismatchException e){
                System.out.println("Você digitou algo irregular, vamos começar de novo.");
                dados.nextLine();
            }
        }dados.close();
    }
}

