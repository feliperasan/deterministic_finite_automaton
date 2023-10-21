import java.util.Locale;
import java.util.Scanner;

import util.AFD;

class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sentença: ");
        String entrada = sc.nextLine();
        
        if(AFD.processar(entrada)) {
            System.out.println("\u001B[32m\u001B[1mCadeia Aceita!");
            System.out.println("");
        } else {
            System.out.println("\u001B[31m\u001B[1mCadeia Rejeitada!");
            System.out.println("");
        }

        sc.close();
    }
}
