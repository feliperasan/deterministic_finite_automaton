import util.AFD;

class App {

    
    public static void main(String[] args) {

        String entrada = "10";
        
        if(AFD.processar(entrada)) {
            System.out.println("A cadeia é valida!");
        } else {
            System.out.println("A cadeia não é valida!");
        }
    }
}
