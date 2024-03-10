package Animais;

public class Cachorro {
    public String nome;
    public String raca;
    public String cor;
    public int altura;
    public double peso;

    @Override
    public String toString() {
        return "Nome: "
                + nome
                + "\nRaça: "
                + raca
                + "\nCor: "
                + cor
                + "\nAltura: "
                + String.format("%d centímetros", altura)
                + "\nPeso: "
                + String.format("%.1f kilos", peso);
    }
}
