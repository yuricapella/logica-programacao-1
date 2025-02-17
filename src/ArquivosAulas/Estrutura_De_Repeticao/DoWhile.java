package ArquivosAulas.Estrutura_De_Repeticao;

public class DoWhile {
    public static void main(String[] args) {
        int count = 0;

        do {
            System.out.println(count);
            count++;

            if(count > 5){
                continue; //parar por aqui e fazer de novo
            }
            System.out.println("chegou aqui");

        } while (count <= 10);
        System.out.println("encerrou!");
    }
}
//executar pelo menos uma vez, pois a condição é verificada no final