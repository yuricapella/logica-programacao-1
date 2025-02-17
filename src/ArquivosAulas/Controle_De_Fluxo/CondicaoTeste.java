package ArquivosAulas.Controle_De_Fluxo;

public class CondicaoTeste {
    public static void main(String[] args) {
        int nota = 55;
        String classificacao = " ";

        if (nota >= 90) {
            classificacao = "A";
        }else if (nota >= 70 && nota < 90) {
            classificacao = "B";
        }
    }
}
