package utils;

public class HappyNumber {

    public static boolean esNumeroFeliz(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = calcularSumaCuadrados(slow);
            fast = calcularSumaCuadrados(calcularSumaCuadrados(fast));

            if (fast == 1) {
                return true;
            }

        } while (slow != fast);

        return false;
    }

    private static int calcularSumaCuadrados(int num) {
        int suma = 0;
        while (num > 0) {
            int digito = num % 10;
            suma += digito * digito;
            num /= 10;
        }
        return suma;
    }
}
