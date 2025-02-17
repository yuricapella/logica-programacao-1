package ArquivosAulas.Enum.Dias_Da_Semana;

public class TesteDiasDaSemana {
    public static void main(String[] args) {
        var dia = DiasDaSemana.valueOf(3);
        System.out.println(dia);
        //DiasDaSemana.DOMINGO; assim que geralmente chama o enum.

        //construtor é nativamente privado e nao da de usar.
        //DiasDaSemana();
    }

}
