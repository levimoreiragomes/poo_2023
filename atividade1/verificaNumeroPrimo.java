public class VerificadorNumeroPrimo {

    public static void main(String[] args) {
        int numero = 17;
        
        if (verificaNumeroPrimo(numero) == 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }

    public static int verificaNumeroPrimo(int n) {
        if (n <= 1) {
            return 0;
        }
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        
        return 1;
    }
}
