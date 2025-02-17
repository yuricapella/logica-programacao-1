package ArquivosAulas.Enum.Dias_Da_Semana;

public enum DiasDaSemana {
    DOMINGO("Domingo", 1),
    SEGUNDA("Segunda-Feira", 2),
    TERÇA("Terça-Feira", 3),
    QUARTA("Quarta-Feira", 4),
    QUINTA("Quinta-Feira", 5),
    SEXTA("Sexta-Feira", 6),
    SABADO("Sabado", 7);

    //Enum é constante e por isso nao tem set, apenas get
    //boa pratica é bom colocar final nas variaveis private
    //private String descricao;
    //private int numero;

    private final String descricao;
    private final int numero;

    DiasDaSemana(String descricao, int numero) {
        this.descricao = descricao;
        this.numero = numero;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getNumero() {
        return numero;
    }
    //metodo interno do enum, metodo de fabrica
    public static DiasDaSemana valueOf(int numero) {
        for(DiasDaSemana dia: values()){
            System.out.println("Dia da semana: " + dia);
            if(dia.getNumero() == numero){
                return dia;
            }
        }
        return null;
    }

    //for each
    //for(String item: lista){
    // }
}
