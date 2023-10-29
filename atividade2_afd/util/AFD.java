package util;

public class AFD {
    private static int estadoAtual;
    private static int verificador = 0;
    private static int quantByte = 0;
    
    public static int getQuantByte() {
        return quantByte;
    }

    public static void processar(String entrada) {
        for (char c : entrada.toCharArray()) {
            quantByte++;
            c = Character.toLowerCase(c);
            switch (estadoAtual) {
                case 0:
                    if (c == ' ' && verificador == 0) {
                        estadoAtual = 0;
                        verificador = 1;
                    } else if (c == 'c' && verificador == 1) {
                        estadoAtual = 1;
                        verificador = 0;
                    }
                    break;
                case 1:
                    if (c == 'o' && verificador == 0) {
                        estadoAtual = 2;
                    } else {
                        verificador = 0;
                        estadoAtual = 0;
                    }
                    break;
                case 2:
                    if (c == 'm' && verificador == 0) {
                        estadoAtual = 3;
                    } else {
                        verificador = 0;
                        estadoAtual = 0;
                    }
                    break;
                case 3:
                    if (c == 'p' && verificador == 0) {
                        estadoAtual = 4;
                    } else {
                        verificador = 0;
                        estadoAtual = 0;
                    }
                    break;
                case 4:
                    if (c == 'u' && verificador == 0) {
                        estadoAtual = 5;
                    } else {
                        verificador = 0;
                        estadoAtual = 0;
                    }
                    break;
                case 5:
                    if (c == 't' && verificador == 0) {
                        estadoAtual = 6;
                    } else {
                        verificador = 0;
                        estadoAtual = 0;
                    }
                    break;
                case 6:
                    if (c == 'a' && verificador == 0) {
                        estadoAtual = 7;
                    } else {
                        verificador = 0;
                        estadoAtual = 0;
                    }
                    break;
                case 7:
                    if (c == 'd' && verificador == 0) {
                        estadoAtual = 8;
                    } else {
                        verificador = 0;
                        estadoAtual = 0;
                    }
                    break;
                case 8:
                    if (c == 'o' && verificador == 0) {
                        estadoAtual = 9;
                    } else {
                        verificador = 0;
                        estadoAtual = 0;
                    }
                    break;
                case 9:
                    if (c == 'r' && verificador == 0) {
                        estadoAtual = 10;
                    } else {
                        verificador = 0;
                        estadoAtual = 0;
                    }
                    break;
                case 10:
                    if (c == ' ' && verificador == 0) {
                        casamentoPalavraComputador();
                    } else {
                        verificador = 0;
                        estadoAtual = 0;
                    }
                    break;
                default:
                    estadoAtual = 0;
                    break;
            }
        }
    }

    private static void casamentoPalavraComputador() {
        System.out.printf("%d ", (getQuantByte() - "computador".length() - 1));
    }
}
