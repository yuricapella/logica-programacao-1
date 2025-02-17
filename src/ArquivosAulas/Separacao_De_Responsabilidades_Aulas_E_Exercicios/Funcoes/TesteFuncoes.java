package ArquivosAulas.Separacao_De_Responsabilidades_Aulas_E_Exercicios.Funcoes;

public class TesteFuncoes {
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];

        Funcoes teste = new Funcoes();
        String resultado = teste.concatenaStrings(nome, sobrenome);

        String resultado2 = Funcoes.concatenaStrings2(nome, sobrenome);

        System.out.println(resultado);
        System.out.println(resultado2);
    }
}
