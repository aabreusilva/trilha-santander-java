import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        //Criando o objeto cachorro para definir a classe.
        Cachorro cachorro = new Cachorro();

        cachorro.nome = "Puppy";
        cachorro.raca = "Chow Chow";
        cachorro.cor = "Marrom";
        cachorro.altura = 25;
        cachorro.peso = 5.5;

        System.out.println(cachorro);
    }
}