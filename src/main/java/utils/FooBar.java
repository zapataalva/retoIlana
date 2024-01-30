package utils;

public class FooBar {

    public void determinaFooBar(int numero) {
        if (esDivisiblePor3Y5(numero)) {
            System.out.println("FooBar");
        } else if (esDivisiblePor3(numero)) {
            System.out.println("Foo");
        } else if (esDivisiblePor5(numero)) {
            System.out.println("Bar");
        } else {
            System.out.println(numero);
        }
    }

    private static boolean esDivisiblePor3(int numero) {
        return numero % 3 == 0;
    }

    private static boolean esDivisiblePor5(int numero) {
        return numero % 5 == 0;
    }

    private static boolean esDivisiblePor3Y5(int numero) {
        return esDivisiblePor3(numero) && esDivisiblePor5(numero);
    }
}
