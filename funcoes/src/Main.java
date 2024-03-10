public class Main {
    public static void main(String[] args) {

        String nome = "Alexandre";
        saudacao(nome);

        int resultado = soma(2, 3);

        System.out.println(resultado);

    }

    //Criando uma função para saudação.
    //Utilizando o String nome dentro de parênteses como parâmetro.
    public static void saudacao(String nome) {
        System.out.println("Olá, " + nome);
    }

    //Criando uma função int para somar.
    //Utilizando dois parâmetros agora.
    public static int soma(int a, int b) {
        return a + b;
    }
}