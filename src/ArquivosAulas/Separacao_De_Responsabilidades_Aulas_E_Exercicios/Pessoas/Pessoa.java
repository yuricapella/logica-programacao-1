package ArquivosAulas.Separacao_De_Responsabilidades_Aulas_E_Exercicios.Pessoas;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int setIdade(int idade) {
        this.idade = idade;
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

}
