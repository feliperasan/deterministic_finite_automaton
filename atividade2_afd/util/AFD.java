package util;

public class AFD {
    private static int estadoAtual;
    private static int quantByte = 0;

    public static void processar(String entrada) {
        for (char c : entrada.toCharArray()) {
            quantByte++;
            switch (estadoAtual) {
                case 0:
                    if (c == 'C' || c == 'c') {
                        estadoAtual = 1;
                    } else if (c == ' ') {
                        estadoAtual = 0;
                    }
                    break;
                case 1:
                    if (c == 'O' || c == 'o') {
                        estadoAtual = 2;
                    } else {
                        estadoAtual = 0;
                    }
                    break;
                case 2:
                    if (c == 'M' || c == 'm') {
                        estadoAtual = 3;
                    } else {
                        estadoAtual = 0;
                    }
                    break;
                case 3:
                    if (c == 'P' || c == 'p') {
                        estadoAtual = 4;
                    } else {
                        estadoAtual = 0;
                    }
                    break;
                case 4:
                    if (c == 'U' || c == 'u') {
                        estadoAtual = 5;
                    } else {
                        estadoAtual = 0;
                    }
                    break;
                case 5:
                    if (c == 'T' || c == 't') {
                        estadoAtual = 6;
                    } else {
                        estadoAtual = 0;
                    }
                    break;
                case 6:
                    if (c == 'A' || c == 'a') {
                        estadoAtual = 7;
                    } else {
                        estadoAtual = 0;
                    }
                    break;
                case 7:
                    if (c == 'D' || c == 'd') {
                        estadoAtual = 8;
                    } else {
                        estadoAtual = 0;
                    }
                    break;
                case 8:
                    if (c == 'O' || c == 'o') {
                        estadoAtual = 9;
                    } else {
                        estadoAtual = 0;
                    }
                    break;
                case 9:  
                    if (c == 'R' || c == 'r') {
                        estadoAtual = 10;
                    } else {
                        estadoAtual = 0;
                    }
                    break;
                case 10:
                    if ((estadoAtual == 10 && c == ' ')) {
                        casamentoPalavraComputador();
                    } else {
                        estadoAtual = 0;
                    }
                    break;
                default:
                    estadoAtual = 0;
                    break;
            }    
        }
    }

    public static int getQuantByte() {
        return quantByte;
    }

    public static void casamentoPalavraComputador() {
        System.out.printf("%d ", (getQuantByte() - estadoAtual - 1));
    }
}
