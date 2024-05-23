public class Contador {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new ParametrosInvalidosException("É necessário fornecer exatamente dois parâmetros.");
            }
            
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            
            if (num1 < 0 || num2 < 0) {
                throw new ParametrosInvalidosException("Os números fornecidos devem ser positivos.");
            }
            
            for (int i = 0; i < num1; i++) {
                for (int j = 0; j < num2; j++) {
                    System.out.print((i * num2) + j + 1 + " ");
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.err.println("Os parâmetros fornecidos devem ser números inteiros.");
        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
