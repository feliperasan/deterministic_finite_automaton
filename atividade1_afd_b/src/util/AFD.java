package util;

public class AFD {
    private static int estadoAtual;
    private static int contarA = 0;

    public static boolean processar(String entrada) {
        for(int c: entrada.toCharArray()) {
            c = Character.toLowerCase(c);
            switch(estadoAtual) {
                case 0:
                    if (c == ' ') {
                        break;
                    } else if (c == 'a') {
                        estadoAtual = 1;
                        contarA++;
                    } else if (c == 'b') {
                        estadoAtual = 3;
                    }
                    break;
                case 1:
                    if (c == 'b') {
                        estadoAtual = 1;
                    } else if (c == 'a') {
                        estadoAtual = 2;
                        contarA++;
                    }
                    break;
                case 2:
                    if (c == 'b') {
                        estadoAtual = 3;
                    } else if (c == 'a') {
                        estadoAtual = 2;
                        contarA++;
                    }
                    break;
                case 3:
                    if (c == 'b') {
                        estadoAtual = 3;
                    } else if (c == 'a') {
                        estadoAtual = 1;
                        contarA++;
                    }
                    break;
                default:
                    estadoAtual = 0;
                    break;
            }
        }
        
        return estadoAtual == 0 || estadoAtual == 3 && contarA % 2 != 1;
    }
}