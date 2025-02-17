package ArquivosAulas.Separacao_De_Responsabilidades_Aulas_E_Exercicios.Pessoas;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Fulano", 30, "123.456.789-00");
        System.out.println(pessoa.getNome());
        pessoa.setNome("Fulano2");
        System.out.println(pessoa.getNome());

        //cascata de funções

        /*
        new Pessoa().getNome().setNome();

        referencia da classe pessoa = new Pessoa()
        .getNome() transforma a referencia da cascata em String e não mais Pessoa
        .setNome é uma função de pessoa e não pode mais ser chamada

        Cascata de funções serve para chamar varios tipos de funções
        mas a cada chamada pode mudar o tipo e pode se perder no tipo de chamada.

        aqui funciona Pessoa novaPessoa = new Pessoa() pois tem a referencia de pessoa
        Pessoa novaPessoa = new Pessoa().getNome();
        o getNome ja transforma a referencia em string e não funciona

        cada vez que chama uma nova função na cascata pode-se mudar o tipo do retorno.

       */
    }
}
