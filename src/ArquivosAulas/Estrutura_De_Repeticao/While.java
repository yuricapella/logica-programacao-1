package ArquivosAulas.Estrutura_De_Repeticao;

public class While {
    public static void main(String[] args) {
        int count = 0;

        while (count <= 10) {
            System.out.println(count);
            count++;

            if(count > 5){
                continue; //parar por aqui e fazer de novo
            }
            System.out.println("chegou aqui");

        }
    }
}
