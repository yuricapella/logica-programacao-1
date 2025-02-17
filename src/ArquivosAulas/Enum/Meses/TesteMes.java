package ArquivosAulas.Enum.Meses;

public class TesteMes {
    public static void main(String[] args) {
        Mes enumMes = Mes.JANEIRO;
        int resultado = 0;
        switch (enumMes){
            case JANEIRO:
            case MARCO:
            case MAIO:
            case JULHO:
            case AGOSTO:
            case OUTUBRO:
            case DEZEMBRO:
                resultado = 31;
                break;
            case ABRIL:
            case JUNHO:
            case SETEMBRO:
            case NOVEMBRO:
                resultado = 30;
                break;
            case FEVEREIRO:
                resultado = 28;
                break;
            default:
                System.out.println("Não foi possivel encontrar o mes");
        }
        System.out.println(resultado);

        int resultadoNovo = switch (enumMes){
            case JANEIRO,MARCO,JULHO,AGOSTO,OUTUBRO,DEZEMBRO -> 31;
            case ABRIL,JUNHO,SETEMBRO,NOVEMBRO -> 30;
            case FEVEREIRO -> 28;
            default -> 0;
        };
        System.out.println(resultadoNovo);
    }
}
