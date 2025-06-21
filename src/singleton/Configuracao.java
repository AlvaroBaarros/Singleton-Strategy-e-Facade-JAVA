package singleton;

public class Configuracao {
    private static Configuracao instancia;

    private Configuracao() {
        System.out.println("Configuração carregada.");
    }

    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }
}