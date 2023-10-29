import java.io.IOException;

import util.AFD;

public class App {
    public static void main(String[] args) {
        final String TEXTO = "O computador é uma máquina capaz de variados tipos de tratamento automático de informações\rou processamento de dados. Entende-se por computador um sistema físico que realiza algum tipo de\rcomputação. Assumiu-se que os computadores pessoais e laptops são ícones da era da informação. O\rprimeiro computador eletromecânico foi construído por Konrad Zuse (1910–1995). Atualmente, um\rmicrocomputador é também chamado computador pessoal ou ainda computador doméstico.";

        System.out.println("|\t\tOCORRENCIAS               |");
        AFD.processar(TEXTO);
        System.out.println("\nQuantidade de Bytes: " + AFD.getQuantByte());
    }
}