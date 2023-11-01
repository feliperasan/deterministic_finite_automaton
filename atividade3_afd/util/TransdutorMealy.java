package util;

public class TransdutorMealy {

  private static int estadoAtual = 0;
  private static int valor50 = 0;
  private static int valor25 = 0;

  public static void processar(String entrada) {
    String[] entradaSeparada = entrada.split(" ");
    for (String c : entradaSeparada) {
      switch (estadoAtual) {
        case 0: // ESTADO INICIAL
          if (c.equals("100")) {
            System.out.print(" 1 ");
            estadoAtual = 0;
          } else if (c.equals("50") && valor50 < 2) {
            System.out.print(" 0 ");
            valor50++;
            estadoAtual = 3;
          } else if (c.equals("25") && valor25 < 4) {
            System.out.print(" 0 ");
            valor25++;
            estadoAtual = 2;
          }
          break;
        
        case 2: // Q2
          if (c.equals("50") && valor50 < 2) {
            System.out.print(" 0 ");
            valor50++;
            estadoAtual = 4;
          } else if (c.equals("25") && valor25 < 4) {
            System.out.print(" 0 ");
            valor25++;
            estadoAtual = 3;
          } else if (c.equals("50") && valor25 == 1 && valor50 == 0) {
            valor50++;
            estadoAtual = 4;
          } else if (c.equals("100")) {
            System.out.print(" 1 ");
            estadoAtual = 0;
          }
          break;

        case 3: // Q3
          if (c.equals("25") && valor25 < 4) {
            System.out.print(" 0 ");
            valor25++;
            estadoAtual = 4;
          } else if (c.equals("25") && valor50 == 1 && valor25 == 0) {
            valor25++;
            estadoAtual = 4;
          }else if (c.equals("50") && valor50 < 2) {
            System.out.print(" 1 ");
            valor50 = 0;
            estadoAtual = 0;
          } else if (c.equals("100")) {
            System.out.print(" 1 ");
            estadoAtual = 0;
          }
          break;
        
        case 4: // Q4
          if (c.equals("25") && valor25 == 3) {
            System.out.print(" 1 ");
            valor25=0;
            estadoAtual = 0;
          } else if (c.equals("25") && valor25 == 1 && valor50 == 1) {
            System.out.print(" 1 ");
            estadoAtual = 0;
          } else if (c.equals("100")) {
            System.out.print(" 1 ");
            estadoAtual = 0;
          }
          break;

        default:
          break;
      }

    }
  }
}