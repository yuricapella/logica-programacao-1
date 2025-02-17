package ArquivosAulas.Enum.Exercicio_01;

public enum OperacaoMatematica {
    SUBTRACAO("-"),
    SOMA("+"),
    DIVISAO("/"),
    MULTIPLICACAO("*"),
    MODULO("%");

    private final String operacao;

    OperacaoMatematica(String operacao) {
        this.operacao = operacao;
    }

    public String getOperacao() {
        return operacao;
    }

    public static OperacaoMatematica ofOperation(String operacao) {
        for (OperacaoMatematica operador : OperacaoMatematica.values()) {
            if (operador.getOperacao().equals(operacao)) {
                return operador;
            }
        }
        return null;
    }
}
