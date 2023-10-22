package util;

public class AFD {
    private static int estadoAtual;

    public static boolean processar(String entrada) {
        for (int c : entrada.toCharArray()) {
            switch (estadoAtual) {
                case 0:
                    if (c == ' ') {
                        estadoAtual = 0;
                        return false; // estado final
                    } else if (c == '1') {
                        estadoAtual = 1;
                    }
                    break;
                case 1:
                    if (c == '0') {
                        estadoAtual = 2;
                    }
                    break;
                case 2:
                    if (c == '0') {
                        estadoAtual = 0;
                    }
                    break;
                default:
                    estadoAtual = 0;
                    break;
            }
        }
        return estadoAtual == 0;
    }
}
