package ArquivosAulas.Separacao_De_Responsabilidades_Aulas_E_Exercicios.Funcoes;

public class Funcoes {
    public static void main(String[] args) {
        /*
        Separação de responsabilidades

        //significado de criar classes e funções
        //Escrevo um codigo
        //esse codigo esta dentro do contexto?
        //se estou calculando imposto
        //classe main precisa fazer esse calculo?
        //se tiver que reutilizar, deveria colocar em uma função
        //a classe que estou fazendo isso, é responsavel por isso ? nao ?
        // então seria melhor criar outra
        //classe FolhaDePagamento
        //classe Extrato
        //os dois precisam fazer calculo de imposto de renda
        //então seria melhor criar a classe imposto de renda,
        // se não vai ter que usar folhadepamento em extrato e nao faz sentido.

        [modificador] tipo_retorno nome ([argumentos]){
            public     void     explicativo(camelCase) ([que precisa receber])
        }
        private só a classe acessa
        void = vazio, sem retorno
        int = retorno int
        string = retorno string

         */

    }
    //Aqui não foi feito construtor mas ele faz automatico um.
    public String concatenaStrings(String texto1, String texto2){
        return texto1 + " " + texto2;
    }

    //Static pode ser chamada sem criar um objeto da classe, ela é avulsa da classe.
    //Posso apenas chama-la como Funcoes.concatenaStrings2(texto1,texto2);

    //Quando usar static? quando tem funções que precisa criar algo, calcular
    //Ela cria a propria classe

    public static String concatenaStrings2(String texto1, String texto2){
        return texto1 + " " + texto2;
    }

}
