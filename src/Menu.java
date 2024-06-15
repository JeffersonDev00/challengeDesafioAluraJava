import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public  void MenuSelecao(){
            System.out.println("""
            ***************************************************************************************************                
            Olá seja-bem vindos ao conversor de moedas!
            1-Dólar para real.(USD)
            2-Franco Suíço para real. (CHF)
            3-Iene Japonês para real. (JPY)
            4-Dirham dos Emirados Árabes Unidos para real. (AED)
            5-Afegane afegão para real. (AFN)
            6-Dram armênio para real. (AMD)
            7-Kwanza angolano para real. (ANG)
            8-Sair.
            ****************************************************************************************************
            Digite uma das opcoes. """);
        }
        public void MenuValor(){
            System.out.println("Qual e o valor quer voce deseja converter?");
        }
        private void ProcessoOpcoes(Scanner dados,ConsultaDeMoeda consulta){}
    }
