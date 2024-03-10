public class Main {
    public static void main(String[] args) {
        //1, 2, 3, 4, 5, 6, 7, 8, 9, 10.
        //Para uma variavel que inicia em 1, chegando a 10, mudando 1 por 1, faça:

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 ; j++) {
                System.out.printf("%d X %d = %d%n", i, j, i * j);
            }
            System.out.println();
        }
    }
}