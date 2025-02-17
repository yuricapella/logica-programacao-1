package ArquivosAulas.Controle_De_Fluxo;

public class CondicaoIsMoving {
    public static void main(String[] args) {
        var isMoving = true;
        // é mais claro criar a variavel isnot do que !isMoving
        var isNotMoving = false;
        var currentSpeed = 0;
        if (isMoving) {
            currentSpeed--;
            System.out.println("Condicao Is Moving");
        }else {
            System.out.println("Condicao Is Not Moving");
        }
    }
}
