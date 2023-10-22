package util;

public class AFD {
    private static int estadoAtual;

    public static boolean processar(String entrada) {
        for(int c: entrada.toCharArray()) {
            switch(estadoAtual) {
                case 0:
                    if (c == ' ') {
                        return false;
                    } else if(c == 'a') {
                        estadoAtual = 1;
                    } else if (c == 'b') {
                        estadoAtual = 3;
                    } else {
                        return false;
                    }
                    break;
                case 1:
                    if (c == 'b') {
                        estadoAtual = 1;
                    } else if (c == 'a') {
                        estadoAtual = 2;
                    } else {
                        return false;
                    }
                    break;
                case 2:
                    if (c == 'b') {
                        estadoAtual = 3;
                    } else {
                        return false;
                    }
                    break;
                case 3:
                    if (c == 'b') {
                        estadoAtual = 3;
                    } else if (c == 'a') {
                        estadoAtual = 1;
                    } else {
                        return false;
                    }
                    break;
                default:
                    estadoAtual = 0;
                    break;
            }
        }
        
        return estadoAtual == 0 || estadoAtual == 3;
    }
}