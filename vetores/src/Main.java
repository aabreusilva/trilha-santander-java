import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int [] numeros = new int[5];
        //[0] [1] [2] [3] [4]

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        String [] letras = new String[5];
        // [A] [B] [C] [D] [E]

        letras[0] = "A";
        letras[1] = "B";
        letras[2] = "C";
        letras[3] = "D";
        letras[4] = "E";

        System.out.println();

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }

        System.out.println();

        //Outra forma de fazer:
        String [] letras1 = {"A", "B", "C", "W", "R"};
        for (int i = 0; i < letras1.length; i++) {
            System.out.println(letras1[i]);
        }

        System.out.println();

        //Apresentando umm do lado do outro.
        System.out.println(Arrays.toString(letras));

        //Criando vetor com numeros diferentes e descobrindo qual é o maior e menor.
        int[] num = {9, 18, 12, 25, 2};
        int maior = num[0];
        int menor = num[0];
        int media = 0;

        for (int i = 0; i < num.length; i++) {

            if (num[i] > maior) {
                maior = num[i];
            }

            if (num[i] < menor) {
                menor = num[i];
            }

            media += numeros[i];

        }



    }
}