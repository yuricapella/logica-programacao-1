package ArquivosAulas.Entradas_E_Saidas;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Saida {
    public static void main(String[] args) {
        /*
        print converte toda informação em string

        Concatenação é soma/junção de strings

        printf recebe pelo menos 2 parametros, $pontoEntrada e variavel

        String y = "qualquer";
        String x = "assunto";
        printf(y,x);  printa qualquer pois não teve $pontoEntrada

        texto inicial $pontoEntrada + variavel
        String y = "qualquer %s";
        String x = "assunto";
        print(y,x);  printa qualquer assunto
        %s é o ponto de entrada para string
        %d para decimal, short, byte, int, long
        %f para float ou double
        %t para datatime
        %tB printa o mês escrito
        %te
        %tY printa o ano
        %tF coloca ano-mes-dia
        %tT coloca hora,minutos,segundos
        %tA dia da semana
        Tem varios outros que pode ser pesquisado na internet.


        Object... args = como se fosse um array, pode colocar de 1 a infinitos argumentos.

        String[] args = é a mesma coisa.

         */
        String textoInicial = "Eu assisto filmes do tipo: %s, %s e tenho %d contas \ne paguei %.2f no dia:\n";
        String genero = "Terror";
        String genero2 = "Comedia";

        int quantidade = 50;
        double valor = 110.543;

        System.out.printf(textoInicial, genero, genero2, quantidade, valor);

        LocalDate data = LocalDate.now();
        LocalDateTime dataHora = LocalDateTime.now();

        LocalDate dataAleatoria = LocalDate.of(2020,3,15);


        System.out.println(data);
        System.out.println(dataHora);
        System.out.println(dataAleatoria);
        System.out.printf("Data e hora: %tF \n%tT", dataHora, dataHora);


    }
}
