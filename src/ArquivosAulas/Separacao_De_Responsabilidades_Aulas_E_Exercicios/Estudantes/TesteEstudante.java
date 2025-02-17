package ArquivosAulas.Separacao_De_Responsabilidades_Aulas_E_Exercicios.Estudantes;

import java.util.Objects;

public class TesteEstudante {
    public static void main(String[] args) {

        Estudante yuri = new Estudante(435,"Yuri","Matematica");
        Estudante igor = new Estudante(435,"Igor","Português");
        Estudante lucas = new Estudante(434,"Lucas","Fisica");

        System.out.println(yuri.equals(igor));
        System.out.println(Objects.equals(yuri,igor));
        System.out.println(Objects.equals(igor,lucas));
    }

}
