import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA!

        String nome = "Alexandre";

        System.out.println(nome.toUpperCase()); //String maiúsculo.
        System.out.println(nome.toLowerCase()); //String minusculo.
        System.out.println(nome.length()); //Quantidade de caracteres a palavra.

        String nomeOutro = "Alexandre";

        //Verifica se o nome declarado a variavel é verdadeiro se o primeiro caractere é maiúsculo.
        //Caso declare a variavel como "alexandre" o resultado será false.
        //Com a função IgnoreCase ela dará como true, pois ela propria ignora a ordem camelCase
        System.out.println(nome.equals(nomeOutro));
        System.out.println(nome.equalsIgnoreCase(nomeOutro));


        //ISO 8601
        //Representando o dia atual utilizando LocalDate {} = LocalDate.now();
        LocalDate hoje = LocalDate.now();

        //Definindo a localização do sistema para tradução.
        Locale brasil = new Locale("pt","BR");

        //Utilizando o getDayOfWeek para descobrir qual o dia da semana. Ex: quarta-feira;
        //Utilizando o getDisplayName() para atribuir a região em que o sistema se encontra.
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));

        //String declarada para saber qual o dia da semana.
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        //Agora precisamos criar a saudação da mensagem.
        String saudacao;

        //Agora que ja descobrimos o número do dia e o dia da semana, precisamos das horas.
        LocalDateTime horas = LocalDateTime.now();

        //Precisamos criar uma condição para saber se a mensagem será BOM DIA, BOA TARDE ou BOA NOITE.
        if (horas.getHour() >= 0 && horas.getHour() < 12) {
            saudacao = "Bom dia";
        } else if (horas.getHour() >= 12 && horas.getHour() < 18) {
            saudacao = "Boa tarde";
        } else if (horas.getHour() >= 18 && horas.getHour() < 24) {
            saudacao = "Boa noite";
        } else {
            saudacao = "Olá.";
        }

        System.out.println();

        //Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA!
        System.out.printf("Olá, %s. Hoje é %s, %s%n!", nome, diaSemana, saudacao.toUpperCase());

    }
}