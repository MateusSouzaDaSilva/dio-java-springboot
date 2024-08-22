public class ExemploBreakContinue {
    
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero++){
            if (numero == 3) {
                continue;

                // com o continue, apenas o numero 3 não é imprimido na tela
            }
            System.out.println(numero);
        }
    }
}
