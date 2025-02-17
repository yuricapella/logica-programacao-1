package ArquivosAulas.Separacao_De_Responsabilidades_Aulas_E_Exercicios.Estudantes;

import java.util.Objects;

public class Estudante {
    private int matricula;
    private String nome;
    private String curso;

    public Estudante(int matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    /*
    Fizemos o próprio método equals, pois o método equals da classe Object compara referências de memória
    e não o conteúdo dos objetos, neste caso comparamos a matricula que é para ser um valor único de cada estudante.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudante estudante = (Estudante) o;
        return matricula == estudante.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }
}
